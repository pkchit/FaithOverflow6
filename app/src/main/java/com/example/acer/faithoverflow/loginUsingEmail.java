package com.example.acer.faithoverflow;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class loginUsingEmail extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_with_email);
        overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
    }

}
