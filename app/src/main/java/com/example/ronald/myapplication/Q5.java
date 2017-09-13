package com.example.ronald.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class Q5 extends AppCompatActivity {


    ListView teams;
    Button submit;
    TextView disp;
    int counter = 0;
    String names[] = {"Newcastle", "Chelsea", "Liverpool", "Southampton", "Manchester City", "Manchester United"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q5);

        teams = (ListView) findViewById(R.id.teams);
        submit = (Button) findViewById(R.id.submit);
        disp = (TextView) findViewById(R.id.display);

        final ArrayAdapter<String> a = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, names);
        teams.setAdapter(a);

        teams.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String t = names[position];
                names[position] = names[counter];
                names[counter] = t;
                counter++;
                a.notifyDataSetChanged();
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String d = "";
                for(int i=0; i<names.length; i++)
                    d = d + Integer.toString(i+1) + ") " + names[i] + "\n";
                disp.setText(d);
                counter = 0;
            }
        });

    }
}
