package com.example.smdassignment01;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Username , Email;                 //declaring variables
    Button Register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getSupportActionBar().hide(); //removes title bar

        Username = findViewById(R.id.uname);
        Email = findViewById(R.id.uname2);
        Register = findViewById(R.id.button);

        Register.setOnClickListener(new View.OnClickListener() {       // on click event
            @Override
            public void onClick(View view) {
                if(Username.getText().toString().equals(Email.getText().toString()))
                {
                    Toast.makeText(MainActivity.this, "Matched", Toast.LENGTH_LONG).show();    //toast parameters
                }
                else{
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                    builder1.setMessage("The provided usrname and email combination didn't match");
                    builder1.setCancelable(true);

                    builder1.setPositiveButton(
                            "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                }
                            });

                    AlertDialog alert11 = builder1.create();
                    alert11.show();
                }

            }
        });



    }
}