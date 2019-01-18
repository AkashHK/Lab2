package com.example.gautamnarayanan.lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Relative extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);
        final EditText username = (EditText)findViewById(R.id.userLogin);
        final EditText password = (EditText)findViewById(R.id.passwordLogin);
        final Button login = (Button)findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!username.getText().toString().isEmpty() && !password.getText().toString().isEmpty())
                {
                    String userString = username.getText().toString();
                    String passString = password.getText().toString();
                    Bundle bundle = new Bundle();
                    bundle.putString("username",userString);
                    bundle.putString("password",passString);
                    Intent i = new Intent(Relative.this,Grid.class);
                    i.putExtra("User_Data",bundle);
                    startActivity(i);
                }
            }
        });
    }
}
