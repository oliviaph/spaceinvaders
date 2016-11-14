package com.example.ming.cs499app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Controller extends AppCompatActivity {
    private Button leftButton,rightButton,settingButton,shootingButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controller);

        leftButton = (Button) findViewById(R.id.button3);
        rightButton = (Button) findViewById(R.id.button4);
        settingButton = (Button) findViewById(R.id.button5);
        shootingButton = (Button) findViewById(R.id.button6);
        //leftButton.eventlistener
        leftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Send signals to ChromeCast
                //to make the object go left
            }
        });
        //rightButton.eventlistener
        rightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Send signals to ChromeCast
                //to make the object go right
            }
        });
        //settingButton.eventlistener
        settingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent("com.example.ming.cs499app.SETTING");
                startActivity(intent3);
            }
        });
        //shootingButton eventlistener
        shootingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Send signals to ChromeCast
                //to make the object shoot
            }
        });
    }

}
