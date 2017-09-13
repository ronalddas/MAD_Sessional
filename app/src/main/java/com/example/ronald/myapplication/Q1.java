package com.example.ronald.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Q1 extends AppCompatActivity {
    String text1,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);

        final EditText e1=(EditText)findViewById(R.id.q1_text1);
        final EditText e2=(EditText)findViewById(R.id.q1_text2);
        final Button button1 = (Button)findViewById(R.id.q1_button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
            text1=e1.getText().toString();
                e2.setText(text1);
            e1.setText("");

            }
        });

        final Button button2 = (Button)findViewById(R.id.q1_button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code here executes on main thread after user presses button

                e2.setText("");
                e1.setText("");

            }
        });
    }
}
