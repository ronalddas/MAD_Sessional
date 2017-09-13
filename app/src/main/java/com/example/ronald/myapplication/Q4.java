package com.example.ronald.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Q4 extends AppCompatActivity {

    String[] states = {"UP","AP","Karnataka","Delhi","Chennai","Bihar"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q4);

        final EditText q4et1=(EditText)findViewById(R.id.q4et1);
        final EditText q4et2=(EditText)findViewById(R.id.q4et2);
        final EditText q4et3=(EditText)findViewById(R.id.q4et3);
        final EditText q4et4=(EditText)findViewById(R.id.q4et4);

        ArrayAdapter<String> state_adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,states);
        state_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final Spinner spinner = (Spinner)findViewById(R.id.spinner);
        spinner.setAdapter(state_adapter);
        findViewById(R.id.q4b).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt = q4et1.getText().toString()+" "+q4et2.getText().toString()+" "+q4et3.getText().toString()+" "+q4et4.getText().toString()+" "+spinner.getSelectedItem().toString();
                Toast.makeText(Q4.this, txt, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
