package com.example.tapovanam_srisathyasaisatcharithra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ch_3 extends AppCompatActivity {

    Button c3pt1, c3pt2, c3pt3, c3pt4, c3pt5, c3pt6, c3pt7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch_3);

        c3pt1 = (Button) findViewById(R.id.ch3pt1);
        c3pt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_3.this, Ch3Pt1.class);
                startActivity(i);
            }
        });
        c3pt2 = (Button) findViewById(R.id.ch3pt2);
        c3pt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_3.this, Ch3Pt2.class);
                startActivity(i);
            }
        });
        c3pt3 = (Button) findViewById(R.id.ch3pt3);
        c3pt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_3.this, Ch3Pt3.class);
                startActivity(i);
            }
        });
        c3pt4 = (Button) findViewById(R.id.ch3pt4);
        c3pt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_3.this, Ch3Pt4.class);
                startActivity(i);
            }
        });
        c3pt5 = (Button) findViewById(R.id.ch3pt5);
        c3pt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_3.this, Ch3Pt5.class);
                startActivity(i);
            }
        });
        c3pt6 = (Button) findViewById(R.id.ch3pt6);
        c3pt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_3.this, Ch3Pt6.class);
                startActivity(i);
            }
        });
        c3pt7 = (Button) findViewById(R.id.ch3pt7);
        c3pt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_3.this, Ch3Pt7.class);
                startActivity(i);
            }
        });
    }
}