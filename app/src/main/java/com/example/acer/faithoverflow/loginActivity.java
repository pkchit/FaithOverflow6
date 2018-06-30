package com.example.acer.faithoverflow;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class loginActivity extends AppCompatActivity implements View.OnClickListener
{
    private String username;
    private String password;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        Button login =findViewById(R.id.button);
        login.setOnClickListener(this);
        Button signup=findViewById(R.id.button2);
        signup.setOnClickListener(this);
        TextView fp=findViewById(R.id.textView2);
        fp.setOnClickListener(this);
    }
    @Override
    public void onClick(View view)
    {
        int i=view.getId();
        switch (i)
        {
            case R.id.button:
                EditText un=findViewById(R.id.username);
                username=un.getText().toString();
                EditText pass=findViewById(R.id.editText);
                password=pass.getText().toString();

                break;
            case R.id.button2:
                Intent i1 = new Intent(loginActivity.this, signupActivity.class);
                startActivity(i1);
                break;
            case R.id.textView2:
                break;
        }
    }
}
