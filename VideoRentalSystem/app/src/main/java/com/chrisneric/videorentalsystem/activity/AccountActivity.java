package com.chrisneric.videorentalsystem.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.chrisneric.videorentalsystem.R;
import com.chrisneric.videorentalsystem.entity.Account;

import static com.chrisneric.videorentalsystem.database.AppDatabase.addAccount;

public class AccountActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Account account = Account.lookupById(getIntent().getIntExtra("accountId",1));
        setContentView(R.layout.activity_account);

        TextView name = findViewById(R.id.lblName);
        TextView address = findViewById(R.id.lblAddress);
        TextView email = findViewById(R.id.lblEmail);
        TextView phone = findViewById(R.id.lblPhone);

        name.setText(account.getName());
        address.setText(account.getAddress());
        email.setText(account.getEmail());
        phone.setText(account.getPhone());
    }

}
