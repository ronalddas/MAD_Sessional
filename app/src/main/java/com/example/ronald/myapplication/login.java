package com.example.ronald.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class login extends AppCompatActivity {

    String editUser,editPassword,User="Jack",Password="Rose";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final Button login=(Button)findViewById(R.id.buttonLogin);
        //final TextView txt=(TextView)findViewById(R.id.onLoginButtonClick);
        final EditText user=(EditText)findViewById(R.id.username);
        final EditText pass =(EditText)findViewById(R.id.password);
        final EditText result=(EditText)findViewById(R.id.LoginResult);
        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                editUser=user.getText().toString();
                editPassword=pass.getText().toString();
                if(editUser.equals(User) && editPassword.equals(Password))
                {
                    result.setText("Login Successfull");

                }
                else{
                    result.setText("Login Failed");
                }

            }
        });
    }
}
