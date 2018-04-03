package com.chrisneric.videorentalsystem.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.chrisneric.videorentalsystem.R;
import com.chrisneric.videorentalsystem.database.AppDatabase;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppDatabase.getAppDatabase(this);
//        DatabaseInitializer.populateSync(AppDatabase.getAppDatabase(this));
        setContentView(R.layout.activity_main);
    }

    public void openAccountsActivity(View v) {
        startActivity(new Intent(this, AccountsActivity.class));
    }

    public void openInventoryActivity(View v) {
        startActivity(new Intent(this, InventoryActivity.class));
    }

    public void openRentalsActivity(View v) {
        startActivity(new Intent(this, RentalsActivity.class));
    }
}
