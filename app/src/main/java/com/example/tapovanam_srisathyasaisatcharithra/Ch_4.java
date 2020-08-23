package com.example.tapovanam_srisathyasaisatcharithra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ch_4 extends AppCompatActivity {

    Button c4pt1, c4pt2, c4pt3, c4pt4, c4pt5, c4pt6, c4pt7, c4pt8, c4pt9, c4pt10, c4pt11, c4pt12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch_4);

        c4pt1 = (Button) findViewById(R.id.ch4pt1);
        c4pt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_4.this, Ch4Pt1.class);
                startActivity(i);
            }
        });
        c4pt2 = (Button) findViewById(R.id.ch4pt2);
        c4pt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_4.this, Ch4Pt2.class);
                startActivity(i);
            }
        });
        c4pt3 = (Button) findViewById(R.id.ch4pt3);
        c4pt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_4.this, Ch4Pt3.class);
                startActivity(i);
            }
        });
        c4pt4 = (Button) findViewById(R.id.ch4pt4);
        c4pt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_4.this, Ch4Pt4.class);
                startActivity(i);
            }
        });
        c4pt5 = (Button) findViewById(R.id.ch4pt5);
        c4pt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_4.this, Ch4Pt5.class);
                startActivity(i);
            }
        });
        c4pt6 = (Button) findViewById(R.id.ch4pt6);
        c4pt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_4.this, Ch4Pt6.class);
                startActivity(i);
            }
        });
        c4pt7 = (Button) findViewById(R.id.ch4pt7);
        c4pt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_4.this, Ch4Pt7.class);
                startActivity(i);
            }
        });
        c4pt8 = (Button) findViewById(R.id.ch4pt8);
        c4pt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_4.this, Ch4Pt8.class);
                startActivity(i);
            }
        });
        c4pt9 = (Button) findViewById(R.id.ch4pt9);
        c4pt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_4.this, Ch4Pt9.class);
                startActivity(i);
            }
        });
        c4pt10 = (Button) findViewById(R.id.ch4pt10);
        c4pt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_4.this, Ch4P10.class);
                startActivity(i);
            }
        });
        c4pt11 = (Button) findViewById(R.id.ch4pt11);
        c4pt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_4.this, Ch4P11.class);
                startActivity(i);
            }
        });
        c4pt12 = (Button) findViewById(R.id.ch4pt12);
        c4pt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_4.this, Ch4P12.class);
                startActivity(i);
            }
        });
    }
}