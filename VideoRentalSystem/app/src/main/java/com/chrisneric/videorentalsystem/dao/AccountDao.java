package com.chrisneric.videorentalsystem.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.chrisneric.videorentalsystem.entity.Account;

import java.util.List;

@Dao
public interface AccountDao {
    @Query("SELECT * FROM account")
    List<Account> getAll();

    @Query("SELECT * FROM account WHERE uid = :id")
    Account findById(int id);

    @Query("SELECT * FROM account WHERE name LIKE :name LIMIT 1")
    Account findByName(String name);

    @Insert
    void insertAll(Account... accounts);

    @Delete
    void delete(Account account);
}