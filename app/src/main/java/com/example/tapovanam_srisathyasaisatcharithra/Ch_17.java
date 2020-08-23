package com.example.tapovanam_srisathyasaisatcharithra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ch_17 extends AppCompatActivity {

    Button c17pt1,c17pt2,c17pt3,c17pt4,c17pt5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch_17);

        c17pt1 = (Button) findViewById(R.id.ch17pt1);
        c17pt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_17.this, Ch17Pt1.class);
                startActivity(i);
            }
        });
        c17pt2 = (Button) findViewById(R.id.ch17pt2);
        c17pt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_17.this, Ch17Pt2.class);
                startActivity(i);
            }
        });
        c17pt3 = (Button) findViewById(R.id.ch17pt3);
        c17pt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_17.this, Ch17Pt3.class);
                startActivity(i);
            }
        });
        c17pt4 = (Button) findViewById(R.id.ch17pt4);
        c17pt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_17.this, Ch17Pt4.class);
                startActivity(i);
            }
        });
        c17pt5 = (Button) findViewById(R.id.ch17pt5);
        c17pt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_17.this, Ch17Pt5.class);
                startActivity(i);
            }
        });
    }
}