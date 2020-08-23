package com.example.tapovanam_srisathyasaisatcharithra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ch_18 extends AppCompatActivity {

    Button c18pt1,c18pt2,c18pt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch_18);

        c18pt1 = (Button) findViewById(R.id.ch18pt1);
        c18pt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_18.this, Ch18Pt1.class);
                startActivity(i);
            }
        });
        c18pt2 = (Button) findViewById(R.id.ch18pt2);
        c18pt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_18.this, Ch18Pt2.class);
                startActivity(i);
            }
        });
        c18pt3 = (Button) findViewById(R.id.ch18pt3);
        c18pt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_18.this, Ch18Pt3.class);
                startActivity(i);
            }
        });
    }
}