package com.chrisneric.videorentalsystem.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "Rental")
public class Rental {
    @PrimaryKey(autoGenerate = true)
    private int uid;
    @ColumnInfo(name = "account_id")
    private int accountId;
    @ColumnInfo(name = "movie_id")
    private int movieId;
    @ColumnInfo(name = "rented_date")
    private Date rentedDate;
    @ColumnInfo(name = "due_date")
    private Date dueDate;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public Date getRentedDate() {
        return rentedDate;
    }

    public void setRentedDate(Date rentedDate) {
        this.rentedDate = rentedDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Rental(int a, int m, Date r, Date d) {
        accountId = a;
        movieId = m;
        rentedDate = r;
        dueDate = d;
    }

//    public static Rental lookupById(int i) {
//        return getRentalById(i);
//    }
}
