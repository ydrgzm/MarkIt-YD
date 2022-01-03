package com.example.loginsignup1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void signUp(android.view.View v){
        setContentView(R.layout.activity_sign_up);
    }
    public void loginP(android.view.View v){
        setContentView(R.layout.activity_login);
    }
}