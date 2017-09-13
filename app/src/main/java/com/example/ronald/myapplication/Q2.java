package com.example.ronald.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Q2 extends AppCompatActivity {

    String date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2);

        final EditText e1=(EditText)findViewById(R.id.q2_text1);

        final Button button1 = (Button)findViewById(R.id.q2_button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code here executes on main thread after user presses button

                String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());

                e1.setText(date);

            }
        });
    }
}
