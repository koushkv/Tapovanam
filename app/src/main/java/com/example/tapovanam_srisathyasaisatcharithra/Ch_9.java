package com.example.tapovanam_srisathyasaisatcharithra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ch_9 extends AppCompatActivity {

    Button c9pt1, c9pt2, c9pt3, c9pt4, c9pt5, c9pt6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch_9);

        c9pt1 = (Button) findViewById(R.id.ch9pt1);
        c9pt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_9.this, Ch9Pt1.class);
                startActivity(i);
            }
        });
        c9pt2 = (Button) findViewById(R.id.ch9pt2);
        c9pt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_9.this, Ch9Pt2.class);
                startActivity(i);
            }
        });
        c9pt3 = (Button) findViewById(R.id.ch9pt3);
        c9pt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_9.this, Ch9Pt3.class);
                startActivity(i);
            }
        });
        c9pt4 = (Button) findViewById(R.id.ch9pt4);
        c9pt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_9.this, Ch9Pt4.class);
                startActivity(i);
            }
        });
        c9pt5 = (Button) findViewById(R.id.ch9pt5);
        c9pt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_9.this, Ch9Pt5.class);
                startActivity(i);
            }
        });
        c9pt6 = (Button) findViewById(R.id.ch9pt6);
        c9pt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_9.this, Ch9Pt6.class);
                startActivity(i);
            }
        });
    }
}