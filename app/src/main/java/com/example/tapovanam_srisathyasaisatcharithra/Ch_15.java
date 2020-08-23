package com.example.tapovanam_srisathyasaisatcharithra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ch_15 extends AppCompatActivity {

    Button c15pt1,c15pt2,c15pt3,c15pt4,c15pt5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch_15);

        c15pt1 = (Button) findViewById(R.id.ch15pt1);
        c15pt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_15.this, Ch15Pt1.class);
                startActivity(i);
            }
        });
        c15pt2 = (Button) findViewById(R.id.ch15pt2);
        c15pt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_15.this, Ch15Pt2.class);
                startActivity(i);
            }
        });
        c15pt3 = (Button) findViewById(R.id.ch15pt3);
        c15pt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_15.this, Ch15Pt3.class);
                startActivity(i);
            }
        });
        c15pt4 = (Button) findViewById(R.id.ch15pt4);
        c15pt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_15.this, Ch15Pt4.class);
                startActivity(i);
            }
        });
        c15pt5 = (Button) findViewById(R.id.ch15pt5);
        c15pt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_15.this, Ch15Pt5.class);
                startActivity(i);
            }
        });
    }
}