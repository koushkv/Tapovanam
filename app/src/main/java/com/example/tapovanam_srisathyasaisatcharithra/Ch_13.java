package com.example.tapovanam_srisathyasaisatcharithra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ch_13 extends AppCompatActivity {

    Button c13pt1,c13pt2,c13pt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch_13);

        c13pt1 = (Button) findViewById(R.id.ch13pt1);
        c13pt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_13.this, Ch13Pt1.class);
                startActivity(i);
            }
        });
        c13pt2 = (Button) findViewById(R.id.ch13pt2);
        c13pt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_13.this, Ch13Pt2.class);
                startActivity(i);
            }
        });
        c13pt3 = (Button) findViewById(R.id.ch13pt3);
        c13pt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_13.this, Ch13Pt3.class);
                startActivity(i);
            }
        });
    }
}