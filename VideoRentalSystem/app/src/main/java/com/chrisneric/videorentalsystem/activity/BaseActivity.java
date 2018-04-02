package com.chrisneric.videorentalsystem.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.chrisneric.videorentalsystem.R;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options, menu);
        return (super.onCreateOptionsMenu(menu));
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.accounts:
                Intent i = new Intent(this, AccountsActivity.class);
                startActivity(i);
                return (true);

            case R.id.inventory:
                i = new Intent(this, InventoryActivity.class);
                startActivity(i);
                return (true);

            case R.id.rentals:
                i = new Intent(this, RentalsActivity.class);
                startActivity(i);
                return (true);
        }
        return (super.onOptionsItemSelected(item));
    }
}
