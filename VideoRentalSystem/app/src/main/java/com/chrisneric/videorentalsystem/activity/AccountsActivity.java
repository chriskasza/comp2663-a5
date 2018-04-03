package com.chrisneric.videorentalsystem.activity;

import android.app.DialogFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.chrisneric.videorentalsystem.R;
import com.chrisneric.videorentalsystem.entity.Account;

import static com.chrisneric.videorentalsystem.database.AppDatabase.searchAccountByName;

public class AccountsActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accounts);
    }

    public void openNewAccountActivity(View v) {
        startActivity(new Intent(this, NewAccountActivity.class));
    }

    public void findAccount(View v) {
        EditText e = findViewById(R.id.txtAccountSearch);
        Account account = searchAccountByName(e.getText().toString());

        if (account != null) {
            Intent i = new Intent(this, AccountActivity.class);
            i.putExtra("ACCOUNT_ID", account.getUid());
            startActivity(i);
        } else {
            DialogFragment dialog = new OkDialog();
            Bundle args = new Bundle();
            args.putString(OkDialog.ARG_TITLE, "Search");
            args.putString(OkDialog.ARG_MESSAGE, "Unable to find an account with that name.");
            dialog.setArguments(args);
            dialog.show(getFragmentManager(), "tag");
        }
    }
}
