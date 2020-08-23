package com.example.tapovanam_srisathyasaisatcharithra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ch_11 extends AppCompatActivity {

    Button c11pt1, c11pt2, c11pt3,c11pt4,c11pt5,c11pt6,c11pt7,c11pt8,c11pt9,c11pt10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch_11);

        c11pt1 = (Button) findViewById(R.id.ch11pt1);
        c11pt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_11.this, Ch11Pt1.class);
                startActivity(i);
            }
        });
        c11pt2 = (Button) findViewById(R.id.ch11pt2);
        c11pt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_11.this, Ch11Pt2.class);
                startActivity(i);
            }
        });
        c11pt3 = (Button) findViewById(R.id.ch11pt3);
        c11pt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_11.this, Ch11Pt3.class);
                startActivity(i);
            }
        });
        c11pt4 = (Button) findViewById(R.id.ch11pt4);
        c11pt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_11.this, Ch11Pt4.class);
                startActivity(i);
            }
        });
        c11pt5 = (Button) findViewById(R.id.ch11pt5);
        c11pt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_11.this, Ch11Pt5.class);
                startActivity(i);
            }
        });
        c11pt6 = (Button) findViewById(R.id.ch11pt6);
        c11pt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_11.this, Ch11Pt6.class);
                startActivity(i);
            }
        });
        c11pt7 = (Button) findViewById(R.id.ch11pt7);
        c11pt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_11.this, Ch11Pt7.class);
                startActivity(i);
            }
        });
        c11pt8 = (Button) findViewById(R.id.ch11pt8);
        c11pt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_11.this, Ch11Pt8.class);
                startActivity(i);
            }
        });
        c11pt9 = (Button) findViewById(R.id.ch11pt9);
        c11pt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_11.this, Ch11Pt9.class);
                startActivity(i);
            }
        });
        c11pt10 = (Button) findViewById(R.id.ch11pt10);
        c11pt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_11.this, Ch11Pt10.class);
                startActivity(i);
            }
        });
    }
}