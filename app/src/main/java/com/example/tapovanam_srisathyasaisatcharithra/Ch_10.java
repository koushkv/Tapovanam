package com.example.tapovanam_srisathyasaisatcharithra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ch_10 extends AppCompatActivity {

    Button c10pt1, c10pt2, c10pt3, c10pt4, c10pt5, c10pt6, c10pt7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch_10);

        c10pt1 = (Button) findViewById(R.id.ch10pt1);
        c10pt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_10.this, Ch10Pt1.class);
                startActivity(i);
            }
        });
        c10pt2 = (Button) findViewById(R.id.ch10pt2);
        c10pt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_10.this, Ch10Pt2.class);
                startActivity(i);
            }
        });
        c10pt3 = (Button) findViewById(R.id.ch10pt3);
        c10pt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_10.this, Ch10Pt3.class);
                startActivity(i);
            }
        });
        c10pt4 = (Button) findViewById(R.id.ch10pt4);
        c10pt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_10.this, Ch10Pt4.class);
                startActivity(i);
            }
        });
        c10pt5 = (Button) findViewById(R.id.ch10pt5);
        c10pt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_10.this, Ch10Pt5.class);
                startActivity(i);
            }
        });
        c10pt6 = (Button) findViewById(R.id.ch10pt6);
        c10pt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_10.this, Ch10Pt6.class);
                startActivity(i);
            }
        });
        c10pt7 = (Button) findViewById(R.id.ch10pt7);
        c10pt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_10.this, Ch10Pt7.class);
                startActivity(i);
            }
        });
    }
}