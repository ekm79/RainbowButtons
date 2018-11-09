package com.lambdaschool.rainbowbuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button greenButton;
    Button yellowButton;
    Button blueButton;
    Button redButton;
    Button purpleButton;
    Button orangeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        greenButton = findViewById(R.id.green_btn);
        greenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                greenButton.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
            }
        });

        yellowButton = findViewById(R.id.yellow_btn);
        yellowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yellowButton.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
            }
        });

        blueButton = findViewById(R.id.blue_btn);
        blueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blueButton.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_bright));
            }
        });

        redButton = findViewById(R.id.red_btn);
        redButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redButton.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            }
        });

        purpleButton = findViewById(R.id.purple_btn);
        purpleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                purpleButton.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
            }
        });

        orangeButton = findViewById(R.id.orange_btn);
        orangeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                orangeButton.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_dark));
            }
        });

    }
}
