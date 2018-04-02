package com.chrisneric.videorentalsystem;

import com.chrisneric.videorentalsystem.entity.Rental;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class RentalUnitTest {
    @Test
    public void RentalCreate_AllAttributes_ReturnsTrue() {
        int accountId = 1;
        int movieId = 2;
        Date rentedDate = new Date(System.currentTimeMillis());
        Date dueDate = new Date(System.currentTimeMillis()+259200000);

        Rental a = new Rental(accountId, movieId, rentedDate, dueDate);

        assertEquals(a.getAccountId(), accountId);
    }

    @Test
    public void RentalCreate_WithNullAttributes_ReturnsTrue() {
        int accountId = 0;
        int movieId = 0;
        Date rentedDate = null;
        Date dueDate = null;

        Rental a = new Rental(accountId, movieId, rentedDate, dueDate);

        assertEquals(a.getAccountId(), accountId);
    }
}