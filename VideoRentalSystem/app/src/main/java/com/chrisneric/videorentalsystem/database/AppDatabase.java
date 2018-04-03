package com.chrisneric.videorentalsystem.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.chrisneric.videorentalsystem.dao.AccountDao;
import com.chrisneric.videorentalsystem.entity.Account;

@Database(entities = {Account.class}, version = 2)
public abstract class AppDatabase extends RoomDatabase {
    private static AppDatabase INSTANCE;

    public static AppDatabase getAppDatabase(Context context) {
        if (INSTANCE == null) {
            INSTANCE =
                    Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, "rental-database")
                            // allow queries on the main thread.
                            // Don't do this on a real app! See PersistenceBasicSample for an example.
                            .allowMainThreadQueries()
                            .fallbackToDestructiveMigration()
                            .build();
        }
        return INSTANCE;
    }

    public static void addAccount(Account account) {
        INSTANCE.accountDao().insertAll(account);
    }

    public static Account getAccountById(int i) {
        return INSTANCE.accountDao().findById(i);
    }

    public static Account getLastEntry() {
        return INSTANCE.accountDao().getLastEntry();
    }

    public static Account searchAccountByName(String s) {
        Account a = INSTANCE.accountDao().findByName("%" + s + "%");

        return a;
//        if(a != null) {
//            return a;
//        } else {
//            return null;
//        }
    }

    public static void destroyInstance() {
        INSTANCE = null;
    }

    public abstract AccountDao accountDao();
}


