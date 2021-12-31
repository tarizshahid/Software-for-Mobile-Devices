package com.example.assignment_04_weather_app;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.JsonObject;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Map;

public class weather1 extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather1);
        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        tv3=findViewById(R.id.tv3);
        tv4=findViewById(R.id.tv4);
        tv5=findViewById(R.id.tv5);
        tv6=findViewById(R.id.tv6);
        tv7=findViewById(R.id.tv7);
        Intent intent = getIntent();
        String city = intent.getStringExtra("weather");
        String api_key="f0f2ca761f89c106b7869ee3f9d1a88d";
        String url="http://api.weatherstack.com/current?access_key=f0f2ca761f89c106b7869ee3f9d1a88d&query="+city;
        RequestQueue queue= Volley.newRequestQueue(getApplicationContext());
        JsonObjectRequest request =new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    JSONObject object=response.getJSONObject("request");
                    JSONObject current=response.getJSONObject("current");
                    //JSONArray array=response.getJSONArray("weather_descriptions");
                    //JSONObject object1=current.getJSONObject(0);
                    String que1=object.getString("query");
                    String desc=current.getString("weather_descriptions");
                    String temperature=current.getString("temperature");
                    String wind_speed=current.getString("wind_speed");
                    String wind_dir=current.getString("wind_dir");
                    String precip=current.getString("precip");
                    String humidity=current.getString("humidity");
                    tv1.setText("City/Country: "+que1);
                    tv2.setText("Description: "+desc);
                    tv3.setText("Temperature: "+temperature+"C");
                    tv4.setText("Wind Speed: "+wind_speed);
                    tv5.setText("Wind direction: "+wind_dir);
                    tv6.setText("Precip: "+precip);
                    tv7.setText("Humidity: "+humidity);
                } catch (JSONException e) {
                    Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_LONG).show();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(weather1.this, error.toString(), Toast.LENGTH_SHORT).show();
            }
        });
        queue.add(request);
    }
}