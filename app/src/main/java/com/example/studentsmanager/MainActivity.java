package com.example.studentsmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static Boolean firstTimeUse =  true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*if(!firstTimeUse)*/ setContentView(R.layout.activity_main);
         /*   else {
            Intent i = new Intent(getApplicationContext(),Register.class);
            firstTimeUse = false;
            startActivity(i);
        }*/

            final EditText usernameField = findViewById(R.id.username);
            final EditText passwordField = findViewById(R.id.password);
        Button loginButton = findViewById(R.id.loginButton);
        Button resetButton = findViewById(R.id.resetButton);

        usernameField.setHint("Your username");
        passwordField.setHint("Password");

        loginButton.setText("Login");
        resetButton.setText("Reset");

        loginButton.setBackgroundColor(Color.parseColor("#027fdc"));
        resetButton.setBackgroundColor(Color.parseColor("#07c4c5"));

        loginButton.setTextColor(Color.parseColor("#ffffff"));
        resetButton.setTextColor(Color.parseColor("#ffffff"));


        loginButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String username = usernameField.getText().toString() ;
                String password = passwordField.getText().toString() ;


                if(username.equalsIgnoreCase("admin") && password.equals("admin")){
                    Intent i = new Intent(getApplicationContext(), Dashboard.class);
                    Toast msg = Toast.makeText(getApplicationContext(),"name:" + username + ": password: "+password,Toast.LENGTH_SHORT);
                    msg.show();
                    startActivity(i);
                }else if(!username.equalsIgnoreCase("admin")){
                    Toast err = Toast.makeText(getApplicationContext(),"Error 101: Incorrect Username",Toast.LENGTH_SHORT);
                    err.show();
                }else if(!password.equals("admin")){
                    Toast err0 = Toast.makeText(getApplicationContext(), "Error: Authentification failed", Toast.LENGTH_SHORT);
                    err0.show();
                }
            }
        });
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usernameField.setText("");
                passwordField.setText("");
            }
        });
    }
}
