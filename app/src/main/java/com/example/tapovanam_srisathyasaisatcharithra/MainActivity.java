package com.example.tapovanam_srisathyasaisatcharithra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button ch1, ch2, ch3, ch4, ch5, ch6, ch7, ch8, ch9, ch10, ch11, ch12,ch13,ch14,ch15,ch16,ch17,ch18,endo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ch1 = (Button) findViewById(R.id.btn1);
        ch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Ch_1.class);
                startActivity(i);
            }
        });
        ch2 = (Button) findViewById(R.id.btn2);
        ch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Ch_2.class);
                startActivity(i);
            }
        });
        ch3 = (Button) findViewById(R.id.btn3);
        ch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Ch_3.class);
                startActivity(i);
            }
        });
        ch4 = (Button) findViewById(R.id.btn4);
        ch4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Ch_4.class);
                startActivity(i);
            }
        });
        ch5 = (Button) findViewById(R.id.btn5);
        ch5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Ch_5.class);
                startActivity(i);
            }
        });
        ch6 = (Button) findViewById(R.id.btn6);
        ch6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Ch_6.class);
                startActivity(i);
            }
        });

        ch7 = (Button) findViewById(R.id.btn7);
        ch7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Ch_7.class);
                startActivity(i);
            }
        });
        ch8 = (Button) findViewById(R.id.btn8);
        ch8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Ch_8.class);
                startActivity(i);
            }
        });
        ch9 = (Button) findViewById(R.id.btn9);
        ch9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Ch_9.class);
                startActivity(i);
            }
        });

        ch10 = (Button) findViewById(R.id.btn10);
        ch10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Ch_10.class);
                startActivity(i);
            }
        });
        ch11 = (Button) findViewById(R.id.btn11);
        ch11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Ch_11.class);
                startActivity(i);
            }
        });
        ch12 = (Button) findViewById(R.id.btn12);
        ch12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Ch_12.class);
                startActivity(i);
            }
        });
        ch13 = (Button) findViewById(R.id.btn13);
        ch13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Ch_13.class);
                startActivity(i);
            }
        });
        ch14 = (Button) findViewById(R.id.btn14);
        ch14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Ch_14.class);
                startActivity(i);
            }
        });
        ch15 = (Button) findViewById(R.id.btn15);
        ch15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Ch_15.class);
                startActivity(i);
            }
        });
        ch16 = (Button) findViewById(R.id.btn16);
        ch16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Ch_16.class);
                startActivity(i);
            }
        });
        ch17 = (Button) findViewById(R.id.btn17);
        ch17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Ch_17.class);
                startActivity(i);
            }
        });
        ch18 = (Button) findViewById(R.id.btn18);
        ch18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Ch_18.class);
                startActivity(i);
            }
        });
        endo = (Button) findViewById(R.id.btn19);
        endo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Ch_19.class);
                startActivity(i);
            }
        });
    }

}