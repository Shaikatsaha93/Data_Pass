package com.example.diu.button;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("User Info");

        Intent intent = getIntent();
        String name_f = intent.getStringExtra("fName");
        String name_l = intent.getStringExtra("lName");
        String mail_e = intent.getStringExtra("Email");
        String mbl = intent.getStringExtra("Phone");
        String pw = intent.getStringExtra("Pword");

        TextView user_info = findViewById(R.id.info);

        user_info.setText("Name : "+name_f+ "  "+name_l+ "\nEmail : " +mail_e+"\nPhone : "+mbl+ "\nPassword : " +pw);
    }
}
