package com.chrisneric.videorentalsystem;

import com.chrisneric.videorentalsystem.entity.Account;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class AccountUnitTest {
    @Test
    public void accountCreate_AllAttributes_ReturnsTrue() {
        String name = "Guy";
        String address = "123 place st.";
        String email = "name@example.org";
        String phone = "000-000-0000";

        Account a = new Account(name, address, email, phone);

        assertEquals(a.getName(), name);
    }

    @Test
    public void accountCreate_WithNullAttributes_ReturnsTrue() {
        String name = null;
        String address = null;
        String email = null;
        String phone = null;

        Account a = new Account(name, address, email, phone);

        assertEquals(a.getName(), name);
    }
}