package com.example.smdassignment02;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class signup extends AppCompatActivity {

    public static final String logemail = "email";
    public static final String password1 = "password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        this.getSupportActionBar().hide();

        EditText email = findViewById(R.id.editTextTextPersonName4);
        EditText password = findViewById(R.id.editTextTextPersonName5);
        Button signup = findViewById(R.id.button2);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            String eml = email.getText().toString().trim();
            String pwd = password.getText().toString().trim();

            Intent i = new Intent(signup.this , MainActivity.class);
            i.putExtra(logemail,eml);
            i.putExtra(password1,pwd);
            startActivity(i);
            }
        });

    }
}