package com.example.registerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Toast;


public class LoginInPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_in_page);
    }

    public void SignedIn (View view) {
        Intent userLog = new Intent (this, MainActivity.class);
        startActivity(userLog);
        Toast.makeText(getApplicationContext(),"Log In Successfully",Toast.LENGTH_SHORT).show();
    }

}