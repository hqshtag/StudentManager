package com.example.studentsmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EditText usernameField = findViewById(R.id.username);
        EditText passwordField = findViewById(R.id.password);
        EditText emailField = findViewById(R.id.email);
        Button registerButton = findViewById(R.id.registerButton);
        Button resetButton = findViewById(R.id.resetButton);


        usernameField.setHint("Username");
        passwordField.setHint("Password");
        emailField.setHint("Email Address");
        registerButton.setText("Register");
        resetButton.setText("Reset");
    }
}
