package com.chrisneric.videorentalsystem.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.chrisneric.videorentalsystem.R;

public class AccountsActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accounts);
    }

    public void openNewAccountActivity(View v) {
        startActivity(new Intent(this, NewAccountActivity.class));
    }

    public void nothing() {
        System.out.println("nothing");
    }
}
