package com.example.tapovanam_srisathyasaisatcharithra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ch_5 extends AppCompatActivity {

    Button c5pt1, c5pt2, c5pt3, c5pt4, c5pt5, c5pt6, c5pt7, c5pt8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch_5);

        c5pt1 = (Button) findViewById(R.id.ch5pt1);
        c5pt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_5.this, Ch5Pt1.class);
                startActivity(i);
            }
        });
        c5pt2 = (Button) findViewById(R.id.ch5pt2);
        c5pt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_5.this, Ch5Pt2.class);
                startActivity(i);
            }
        });
        c5pt3 = (Button) findViewById(R.id.ch5pt3);
        c5pt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_5.this, Ch5Pt3.class);
                startActivity(i);
            }
        });
        c5pt4 = (Button) findViewById(R.id.ch5pt4);
        c5pt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_5.this, Ch5Pt4.class);
                startActivity(i);
            }
        });
        c5pt5 = (Button) findViewById(R.id.ch5pt5);
        c5pt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_5.this, Ch5Pt5.class);
                startActivity(i);
            }
        });
        c5pt6 = (Button) findViewById(R.id.ch5pt6);
        c5pt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_5.this, Ch5Pt6.class);
                startActivity(i);
            }
        });
        c5pt7 = (Button) findViewById(R.id.ch5pt7);
        c5pt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_5.this, Ch5Pt7.class);
                startActivity(i);
            }
        });
        c5pt8 = (Button) findViewById(R.id.ch5pt8);
        c5pt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_5.this, Ch5Pt8.class);
                startActivity(i);
            }
        });
    }
}