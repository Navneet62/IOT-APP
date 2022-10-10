package com.example.iotremote;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton fanButton;
    private ImageButton bulbButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fanButton = findViewById(R.id.fanButton);
        bulbButton = findViewById(R.id.bulbButton);

        fanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchFanActivity();
            }
        });

        bulbButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchBulbActivity();
            }
        });
    }
    private void switchBulbActivity(){
        Intent intent = new Intent(this, BulbActivity.class);
        startActivity(intent);
    }
    private void switchFanActivity(){
        Intent intent = new Intent(this, FanActivity.class);
        startActivity(intent);
    }
}