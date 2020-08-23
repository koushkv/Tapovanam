package com.example.tapovanam_srisathyasaisatcharithra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ch_6 extends AppCompatActivity {

    Button c6pt1, c6pt2, c6pt3, c6pt4, c6pt5, c6pt6, c6pt7, c6pt8, c6pt9, c6pt10, c6pt11, c6pt12, c6pt13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch_6);

        c6pt1 = (Button) findViewById(R.id.ch6pt1);
        c6pt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_6.this, Ch6Pt1.class);
                startActivity(i);
            }
        });
        c6pt2 = (Button) findViewById(R.id.ch6pt2);
        c6pt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_6.this, Ch6Pt2.class);
                startActivity(i);
            }
        });
        c6pt3 = (Button) findViewById(R.id.ch6pt3);
        c6pt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_6.this, Ch6Pt3.class);
                startActivity(i);
            }
        });
        c6pt4 = (Button) findViewById(R.id.ch6pt4);
        c6pt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_6.this, Ch6Pt4.class);
                startActivity(i);
            }
        });
        c6pt5 = (Button) findViewById(R.id.ch6pt5);
        c6pt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_6.this, Ch6Pt5.class);
                startActivity(i);
            }
        });
        c6pt6 = (Button) findViewById(R.id.ch6pt6);
        c6pt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_6.this, Ch6Pt6.class);
                startActivity(i);
            }
        });
        c6pt7= (Button) findViewById(R.id.ch6pt7);
        c6pt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_6.this, Ch6Pt7.class);
                startActivity(i);
            }
        });
        c6pt8= (Button) findViewById(R.id.ch6pt8);
        c6pt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_6.this, Ch6Pt8.class);
                startActivity(i);
            }
        });
        c6pt9= (Button) findViewById(R.id.ch6pt9);
        c6pt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_6.this, Ch6Pt9.class);
                startActivity(i);
            }
        });
        c6pt10= (Button) findViewById(R.id.ch6pt10);
        c6pt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_6.this, Ch6P10.class);
                startActivity(i);
            }
        });
        c6pt11= (Button) findViewById(R.id.ch6pt11);
        c6pt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_6.this, Ch6P11.class);
                startActivity(i);
            }
        });
        c6pt12= (Button) findViewById(R.id.ch6pt12);
        c6pt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_6.this, Ch6P12.class);
                startActivity(i);
            }
        });
        c6pt13= (Button) findViewById(R.id.ch6pt13);
        c6pt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_6.this, Ch6P13.class);
                startActivity(i);
            }
        });

    }
}