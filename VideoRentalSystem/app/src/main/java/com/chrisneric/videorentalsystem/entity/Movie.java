package com.chrisneric.videorentalsystem.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "Movie")
public class Movie {
    @PrimaryKey(autoGenerate = true)
    private int uid;
    @ColumnInfo(name = "title")
    private String title;
    @ColumnInfo(name = "state")
    private String state;

    public Movie(String t, String s) {
        title = t;
        state = s;
    }

//    public static Movie lookupById(int i) {
//        return getMovieById(i);
//    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
