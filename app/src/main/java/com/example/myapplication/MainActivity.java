package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(new Dz1_7_6(this));
        setContentView(new Dz1_7_6_2(this));
        setContentView(new Dz1_7_6_3(this));
        setContentView(new Dz1_7_7(this));

    }
}
