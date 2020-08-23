package com.example.tapovanam_srisathyasaisatcharithra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ch_2 extends AppCompatActivity {

    Button c2pt1, c2pt2, c2pt3, c2pt4, c2pt5, c2pt6, c2pt7, c2pt8, c2pt9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch_2);

        c2pt1 = (Button) findViewById(R.id.ch2pt1);
        c2pt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_2.this, Ch2Pt1.class);
                startActivity(i);
            }
        });
        c2pt2 = (Button) findViewById(R.id.ch2pt2);
        c2pt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_2.this, Ch2Pt2.class);
                startActivity(i);
            }
        });
        c2pt3 = (Button) findViewById(R.id.ch2pt3);
        c2pt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_2.this, Ch2Pt3.class);
                startActivity(i);
            }
        });
        c2pt4 = (Button) findViewById(R.id.ch2pt4);
        c2pt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_2.this, Ch2Pt4.class);
                startActivity(i);
            }
        });
        c2pt5 = (Button) findViewById(R.id.ch2pt5);
        c2pt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_2.this, Ch2Pt5.class);
                startActivity(i);
            }
        });
        c2pt6 = (Button) findViewById(R.id.ch2pt6);
        c2pt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_2.this, Ch2Pt6.class);
                startActivity(i);
            }
        });
        c2pt7 = (Button) findViewById(R.id.ch2pt7);
        c2pt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_2.this, Ch2Pt7.class);
                startActivity(i);
            }
        });
        c2pt8 = (Button) findViewById(R.id.ch2pt8);
        c2pt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_2.this, Ch2Pt8.class);
                startActivity(i);
            }
        });
        c2pt9 = (Button) findViewById(R.id.ch2pt9);
        c2pt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_2.this, Ch2Pt9.class);
                startActivity(i);
            }
        });
    }
}