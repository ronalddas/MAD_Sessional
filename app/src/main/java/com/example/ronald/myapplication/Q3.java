package com.example.ronald.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import static android.R.id.list;

public class Q3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q3);

        findViewById(R.id.q3b).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et1, et2;
                CheckBox cb1, cb2;
                et1 = (EditText) findViewById(R.id.q3et1);
                et2 = (EditText) findViewById(R.id.q3et2);
                RadioGroup rg = (RadioGroup) findViewById(R.id.q3rgrp);
                RadioButton rb = (RadioButton) findViewById(rg.getCheckedRadioButtonId());
                String gender = rb.getText().toString();
                String name = et1.getText().toString();
                String mail = et2.getText().toString();
                cb1 = (CheckBox) findViewById(R.id.q3ch1);
                cb2 = (CheckBox) findViewById(R.id.q3ch2);
                String str = "Name: " + name + " Mail: " + mail + " Gender: " + gender;
                if (cb1.isChecked()) {
                    str += " Need Book ";
                }
                if (cb2.isChecked()) {
                    str += " Need Notebook";
                }

                Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();

            }
        });

        final ArrayList<String> alist = new ArrayList<String>(Arrays.asList(list));
        final ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.list_adapter, alist);

        ListView listView = (ListView) findViewById(R.id.lview);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String temp = alist.get(position);
                if (temp.equals(curTeam)) {
                    if (position == (list.length-1)) {
                    } else {
                        alist.remove(position);
                        alist.add(position + 1, temp);
                    }
                } else {
                    curTeam = temp;
                    alist.remove(position);
                    alist.add(0, temp);
                }
                adapter.notifyDataSetChanged();
            }
        });

        findViewById(R.id.q5b).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Q3.this, alist.toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
