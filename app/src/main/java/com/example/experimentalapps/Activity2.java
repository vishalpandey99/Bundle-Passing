package com.example.experimentalapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    private TextView txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        txt1 = txt1.findViewById(R.id.txt1);

        Intent intent = getIntent();
        String name = intent.getStringExtra("Name");

        txt1.setText(name);
    }
}