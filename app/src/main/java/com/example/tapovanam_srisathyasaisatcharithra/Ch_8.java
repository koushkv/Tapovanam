package com.example.tapovanam_srisathyasaisatcharithra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ch_8 extends AppCompatActivity {

    Button c8pt1, c8pt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch_8);

        c8pt1 = (Button) findViewById(R.id.ch8pt1);
        c8pt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_8.this, Ch8Pt1.class);
                startActivity(i);
            }
        });
        c8pt2 = (Button) findViewById(R.id.ch8pt2);
        c8pt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ch_8.this, Ch8Pt2.class);
                startActivity(i);
            }
        });
    }
}