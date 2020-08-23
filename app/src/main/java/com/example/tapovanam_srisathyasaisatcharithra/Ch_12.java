package com.example.tapovanam_srisathyasaisatcharithra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ch_12 extends AppCompatActivity {

    Button c12pt1,c12pt2,c12pt3,c12pt4,c12pt5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch_12);

        c12pt1 = (Button) findViewById(R.id.ch12pt1);
        c12pt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_12.this, Ch12Pt1.class);
                startActivity(i);
            }
        });
        c12pt2 = (Button) findViewById(R.id.ch12pt2);
        c12pt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_12.this, Ch12Pt2.class);
                startActivity(i);
            }
        });
        c12pt3 = (Button) findViewById(R.id.ch12pt3);
        c12pt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_12.this, Ch12Pt3.class);
                startActivity(i);
            }
        });
        c12pt4 = (Button) findViewById(R.id.ch12pt4);
        c12pt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_12.this, Ch12Pt4.class);
                startActivity(i);
            }
        });
        c12pt5 = (Button) findViewById(R.id.ch12pt5);
        c12pt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_12.this, Ch12Pt5.class);
                startActivity(i);
            }
        });
    }
}