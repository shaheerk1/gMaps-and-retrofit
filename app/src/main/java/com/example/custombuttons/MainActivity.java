package com.example.custombuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mapButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mapFunc(View v){

        Log.d("testt", "map click ");

        Intent intent = new Intent(MainActivity.this, MapAsctivity.class);
        startActivity(intent);
    }


    public void fetchData(View v){

        Log.d("testt", "fetch click");
        Intent intent = new Intent(MainActivity.this, DatalistActivity.class);
        startActivity(intent);
    }



}