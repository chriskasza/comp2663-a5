package com.chrisneric.videorentalsystem.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.chrisneric.videorentalsystem.R;
import com.chrisneric.videorentalsystem.entity.Account;

import static com.chrisneric.videorentalsystem.database.AppDatabase.addAccount;

public class NewAccountActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_account);
    }

    public void clickSave(View v) {
//        Account account = createAccount();
        Account account = addAccount(createAccount());
        Intent i = new Intent(this, AccountActivity.class);

        i.putExtra("accountId", account.getUid());

        startActivity(i);
    }

    public Account createAccount() {
        EditText name = findViewById(R.id.txtName);
        EditText address = findViewById(R.id.txtAddress);
        EditText email = findViewById(R.id.txtEmail);
        EditText phone = findViewById(R.id.txtPhone);
        Account account = new Account(
                name.getText().toString(),
                address.getText().toString(),
                email.getText().toString(),
                phone.getText().toString());

        return account;
    }
}
