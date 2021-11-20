package com.example.smdassignment02;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class credidentials extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credidentials);

        TextView edfullname = (TextView) findViewById(R.id.full_name);
        TextView edName = (TextView) findViewById(R.id.namefield);
        TextView edpass = (TextView) findViewById(R.id.passfield);
        TextView edphone = (TextView) findViewById(R.id.phonefield);
        TextView edaddress = (TextView) findViewById(R.id.addressfield);

        Button btn1 = (Button) findViewById(R.id.exitbtn);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


    }


    @Override
    public void onBackPressed() {
        final AlertDialog.Builder builder = new AlertDialog.Builder(credidentials.this);
        builder.setMessage("Are you sure want to exit ?");
        builder.setCancelable(true);
        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        builder.setPositiveButton("Close!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        AlertDialog a = builder.create();
        a.show();
    }




}
