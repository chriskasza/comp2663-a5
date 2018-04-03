package com.chrisneric.videorentalsystem.activity;

import android.os.Bundle;
import android.widget.TextView;

import com.chrisneric.videorentalsystem.R;
import com.chrisneric.videorentalsystem.entity.Account;

public class AccountActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int accountId = getIntent().getExtras().getInt("ACCOUNT_ID", 99);

        System.out.println("accountId: " + accountId);

        Account account = Account.lookupById(accountId);

        System.out.println(account.toString());

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
