package com.example.tapovanam_srisathyasaisatcharithra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ch_1 extends AppCompatActivity {

    Button c1pt1, c1pt2, c1pt3, c1pt4, c1pt5, c1pt6, c1pt7, c1pt8, c1pt9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch_1);

        c1pt1 = (Button) findViewById(R.id.ch1pt1);
        c1pt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_1.this, Ch1Pt1.class);
                startActivity(i);
            }
        });
        c1pt2 = (Button) findViewById(R.id.ch1pt2);
        c1pt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_1.this, Ch1Pt2.class);
                startActivity(i);
            }
        });
        c1pt3 = (Button) findViewById(R.id.ch1pt3);
        c1pt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_1.this, Ch1Pt3.class);
                startActivity(i);
            }
        });
        c1pt4 = (Button) findViewById(R.id.ch1pt4);
        c1pt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_1.this, Ch1Pt4.class);
                startActivity(i);
            }
        });
        c1pt5 = (Button) findViewById(R.id.ch1pt5);
        c1pt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_1.this, Ch1Pt5.class);
                startActivity(i);
            }
        });
        c1pt6 = (Button) findViewById(R.id.ch1pt6);
        c1pt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_1.this, Ch1Pt6.class);
                startActivity(i);
            }
        });
        c1pt7 = (Button) findViewById(R.id.ch1pt7);
        c1pt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_1.this, Ch1Pt7.class);
                startActivity(i);
            }
        });
        c1pt8 = (Button) findViewById(R.id.ch1pt8);
        c1pt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_1.this, Ch1Pt8.class);
                startActivity(i);
            }
        });
        c1pt9 = (Button) findViewById(R.id.ch1pt9);
        c1pt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_1.this, Ch1Pt9.class);
                startActivity(i);
            }
        });

    }
}