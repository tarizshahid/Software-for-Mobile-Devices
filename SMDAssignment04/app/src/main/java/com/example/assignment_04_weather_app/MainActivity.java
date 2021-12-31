package com.example.assignment_04_weather_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et=findViewById(R.id.et);
    }
//    public void Getinfo(View v){
//
//    }

    public void getweather(View view) {
        Intent intent = new Intent(this,weather1.class);
        String city=et.getText().toString();
        intent.putExtra("weather",city);
        startActivity(intent);
    }
}