package com.chrisneric.videorentalsystem.utils;

import android.os.AsyncTask;
import android.support.annotation.NonNull;

import com.chrisneric.videorentalsystem.database.AppDatabase;
import com.chrisneric.videorentalsystem.entity.Account;

public class DatabaseInitializer {
    public static void populateAsync(@NonNull final AppDatabase db) {
        PopulateDbAsync task = new PopulateDbAsync(db);
        task.execute();
    }

    public static void populateSync(@NonNull final AppDatabase db) {
        populateWithTestData(db);
    }

    private static Account addTest(final AppDatabase db, Account account) {
        db.accountDao().insertAll(account);
        return account;
    }

    private static void populateWithTestData(AppDatabase db) {
        Account account = new Account();
        account.setName("Chris Kasza");
        account.setAddress("123 addr, city");
        account.setEmail("chris.kasza@gmail.com");
        account.setPhone("000-000-0000");
        addTest(db, account);

//        List<Account> accountList = db.accountDao().getAll();
//        System.out.println("Rows Count: " + accountList.size());
//        Account a = db.accountDao().findByName("Chris%");
//        System.out.println(a.toString());

//        Log.d(DatabaseInitializer.TAG, "Rows Count: " + accountList.size());
    }

    private static class PopulateDbAsync extends AsyncTask<Void, Void, Void> {

        private final AppDatabase mDb;

        PopulateDbAsync(AppDatabase db) {
            mDb = db;
        }

        @Override
        protected Void doInBackground(final Void... params) {
            populateWithTestData(mDb);
            return null;
        }

    }
}
