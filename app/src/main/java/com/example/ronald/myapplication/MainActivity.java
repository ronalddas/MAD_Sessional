package com.example.ronald.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    String a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Intent for Sum of two numbers
        final Button sumButton = (Button)findViewById(R.id.sumButton);
        sumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent newIntentSum = new Intent(MainActivity.this,sumOfTwoNumbers.class);
                startActivity(newIntentSum);

            }
        });

        //Intent for Login Page
        final Button loginButton=(Button)findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newIntentLogin= new Intent(MainActivity.this,login.class);
                startActivity(newIntentLogin);
            }
        });

        //Intent for New,Open,Save and Exit
        final Button newOpenSaveButton = (Button)findViewById(R.id.newOpenSaveButton);
        newOpenSaveButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent newIntentNew=new Intent(MainActivity.this,newOpenSave.class);
                startActivity(newIntentNew);
            }
        });


    }

}
