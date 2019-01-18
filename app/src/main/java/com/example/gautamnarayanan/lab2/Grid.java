package com.example.gautamnarayanan.lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Grid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
        Bundle bundle = getIntent().getBundleExtra("User_Data");
        String username = bundle.getString("username");
        String password = bundle.getString("password");
        EditText name = (EditText)findViewById(R.id.nameData);
        EditText pass = (EditText)findViewById(R.id.passData);

        name.setText(username);
        pass.setText(password);
    }
}
