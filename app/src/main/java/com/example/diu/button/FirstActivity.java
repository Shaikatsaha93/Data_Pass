package com.example.diu.button;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Register");

        final EditText first = findViewById(R.id.f_name);
        final EditText last = findViewById(R.id.l_name);
        final EditText mail = findViewById(R.id.email);
        final EditText phn = findViewById(R.id.phone);
        final EditText pass = findViewById(R.id.password);

        Button btn = (Button) findViewById(R.id.next);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name_f = first.getText().toString();
                String name_l = last.getText().toString();
                String mail_e = mail.getText().toString();
                String mbl = phn.getText().toString();
                String pw = pass.getText().toString();

                Intent i = new Intent(FirstActivity.this, SecondActivity.class);

                i.putExtra("fName", name_f);
                i.putExtra("lName", name_l);
                i.putExtra("Email", mail_e);
                i.putExtra("Phone", mbl);
                i.putExtra("Pword", pw);

                startActivity(i);
            }
        });
    }
}
