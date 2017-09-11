package com.example.ronald.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class sumOfTwoNumbers extends AppCompatActivity {


    int value1,value2,value3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum_of_two_numbers);

        final EditText e1= (EditText)findViewById(R.id.intA);


        final EditText e2 = (EditText)findViewById(R.id.intB);



        final EditText e3 = (EditText)findViewById(R.id.sumText);


        final Button calculateSum = (Button)findViewById(R.id.calculateSumButton);
        calculateSum.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String myEditValue1 = e1.getText().toString();
                 value1 = Integer.parseInt(myEditValue1);
                String myEditValue2 = e2.getText().toString();
                value2 = Integer.parseInt(myEditValue2);

                value3=value1+value2;
                //String a="Hello";
                e3.setText(Integer.toString(value3));


            }
        });
    }
}
