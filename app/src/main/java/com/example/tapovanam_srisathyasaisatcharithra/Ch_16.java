package com.example.tapovanam_srisathyasaisatcharithra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ch_16 extends AppCompatActivity {

    Button c16pt1,c16pt2,c16pt3,c16pt4,c16pt5,c16pt6,c16pt7,c16pt8,c16pt9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch_16);

        c16pt1 = (Button) findViewById(R.id.ch16pt1);
        c16pt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_16.this, Ch16Pt1.class);
                startActivity(i);
            }
        });
        c16pt1 = (Button) findViewById(R.id.ch16pt2);
        c16pt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_16.this, Ch16Pt2.class);
                startActivity(i);
            }
        });
        c16pt1 = (Button) findViewById(R.id.ch16pt3);
        c16pt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_16.this, Ch16Pt3.class);
                startActivity(i);
            }
        });
        c16pt1 = (Button) findViewById(R.id.ch16pt4);
        c16pt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_16.this, Ch16Pt4.class);
                startActivity(i);
            }
        });
        c16pt1 = (Button) findViewById(R.id.ch16pt5);
        c16pt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_16.this, Ch16Pt5.class);
                startActivity(i);
            }
        });
        c16pt1 = (Button) findViewById(R.id.ch16pt6);
        c16pt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_16.this, Ch16Pt6.class);
                startActivity(i);
            }
        });
        c16pt1 = (Button) findViewById(R.id.ch16pt7);
        c16pt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_16.this, Ch16Pt7.class);
                startActivity(i);
            }
        });
        c16pt1 = (Button) findViewById(R.id.ch16pt8);
        c16pt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_16.this, Ch16Pt8.class);
                startActivity(i);
            }
        });
        c16pt1 = (Button) findViewById(R.id.ch16pt9);
        c16pt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_16.this, Ch16Pt9.class);
                startActivity(i);
            }
        });
    }
}