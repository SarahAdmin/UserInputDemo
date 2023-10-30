package com.example.registerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   public void SignIn (View view) {
        Intent LogIntentOne = new Intent(this,LoginInPage.class);
        startActivity(LogIntentOne);

   }

   public void Register (View view) {
        Intent LogIntentTwo = new Intent(this, RegisterAUser.class);
        startActivity(LogIntentTwo);
   }


}