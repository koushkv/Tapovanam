package com.example.tapovanam_srisathyasaisatcharithra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ch_14 extends AppCompatActivity {
    Button c14pt1,c14pt2,c14pt3,c14pt4,c14pt5,c14pt6,c14pt7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch_14);

        c14pt1 = (Button) findViewById(R.id.ch14pt1);
        c14pt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_14.this, Ch14Pt1.class);
                startActivity(i);
            }
        });
        c14pt2 = (Button) findViewById(R.id.ch14pt2);
        c14pt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_14.this, Ch14Pt2.class);
                startActivity(i);
            }
        });
        c14pt3 = (Button) findViewById(R.id.ch14pt3);
        c14pt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_14.this, Ch14Pt3.class);
                startActivity(i);
            }
        });
        c14pt4 = (Button) findViewById(R.id.ch14pt4);
        c14pt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_14.this, Ch14Pt4.class);
                startActivity(i);
            }
        });
        c14pt5 = (Button) findViewById(R.id.ch14pt5);
        c14pt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_14.this, Ch14Pt5.class);
                startActivity(i);
            }
        });
        c14pt6 = (Button) findViewById(R.id.ch14pt6);
        c14pt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_14.this, Ch14Pt6.class);
                startActivity(i);
            }
        });
        c14pt7 = (Button) findViewById(R.id.ch14pt7);
        c14pt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_14.this, Ch14Pt7.class);
                startActivity(i);
            }
        });
    }
}