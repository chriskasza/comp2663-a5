package com.chrisneric.videorentalsystem;

import com.chrisneric.videorentalsystem.entity.Account;
import com.chrisneric.videorentalsystem.entity.Movie;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class MovieUnitTest {
    @Test
    public void movieCreate_AllAttributes_ReturnsTrue() {
        String title = "Get Shorty";
        String state = "Checked In";

        Movie m = new Movie(title, state);

        assertEquals(m.getTitle(), title);
    }

    @Test
    public void accountCreate_WithNullAttributes_ReturnsTrue() {
        String title = null;
        String state = null;

        Movie m = new Movie(title, state);

        assertEquals(m.getTitle(), title);
    }
}