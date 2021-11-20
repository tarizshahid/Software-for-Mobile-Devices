package com.example.smdassignment02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getSupportActionBar().hide();

    EditText emllogin = findViewById(R.id.editTextTextEmailAddress2);
    EditText pwdlogin = findViewById(R.id.editTextTextPassword3);
    Button login = findViewById(R.id.button);
    TextView Signup = findViewById(R.id.editTextTextPersonName);

    Signup.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent signup = new Intent(MainActivity.this, signup.class);
            startActivity(signup);

        }
    });


    login.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            String rcvemail = getIntent().getStringExtra(signup.logemail);
            String rcvpwd = getIntent().getStringExtra(signup.password1);
            if(emllogin.getText().toString().equals(rcvemail) && (pwdlogin.getText().toString().equals(rcvpwd)))
            {
                Intent home = new Intent(MainActivity.this , HomeScreen.class);

                startActivity(home);
            }
            else
                Toast.makeText(MainActivity.this, "Email/Password Incorrect", Toast.LENGTH_SHORT).show();
        }
    });




    }
}