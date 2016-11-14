package com.example.ming.cs499app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SETTING extends AppCompatActivity {
    private Button returnButton,speedButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        //Initialize buttons
        returnButton = (Button) findViewById(R.id.button8);
        speedButton = (Button) findViewById(R.id.button7);
        //returnButton eventlisters
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent("com.example.ming.cs499app.Controller");
                startActivity(intent5);
            }
        });

        //speedButton eventlistener
        speedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //send signals to ChromeCast
                //to adjust the speed
            }
        });
    }

}
