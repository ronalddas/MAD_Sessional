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
        final Button Q1 = (Button)findViewById(R.id.Q1);
        Q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent newIntentSum = new Intent(MainActivity.this,Q1.class);
                startActivity(newIntentSum);

            }
        });

        //Intent for Login Page
        final Button Q2=(Button)findViewById(R.id.Q2);
        Q2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newIntentLogin= new Intent(MainActivity.this,Q2.class);
                startActivity(newIntentLogin);
            }
        });

        //Intent for New,Open,Save and Exit
        final Button Q3 = (Button)findViewById(R.id.Q3);
        Q3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent newIntentNew=new Intent(MainActivity.this,Q3.class);
                startActivity(newIntentNew);
            }
        });

        final Button Q4 = (Button)findViewById(R.id.Q4);
        Q4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent newIntentNew=new Intent(MainActivity.this,Q4.class);
                startActivity(newIntentNew);
            }
        });

        final Button Q5 = (Button)findViewById(R.id.Q5);
        Q5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent newIntentNew=new Intent(MainActivity.this,Q5.class);
                startActivity(newIntentNew);
            }
        });


    }

}
