package com.example.tapovanam_srisathyasaisatcharithra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ch_7 extends AppCompatActivity {

    Button c7pt1, c7pt2, c7pt3, c7pt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch_7);

        c7pt1 = (Button) findViewById(R.id.ch7pt1);
        c7pt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_7.this, Ch7Pt1.class);
                startActivity(i);
            }
        });
        c7pt2 = (Button) findViewById(R.id.ch7pt2);
        c7pt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_7.this, Ch7Pt2.class);
                startActivity(i);
            }
        });
        c7pt3 = (Button) findViewById(R.id.ch7pt3);
        c7pt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_7.this, Ch7Pt3.class);
                startActivity(i);
            }
        });
        c7pt4 = (Button) findViewById(R.id.ch7pt4);
        c7pt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_7.this, Ch7Pt4.class);
                startActivity(i);
            }
        });
    }
}