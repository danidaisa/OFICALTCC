package com.example.oficialtcc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        {
            Button btnButtonAtivity = findViewById(R.id.entrar);

            btnButtonAtivity.setOnClickListener(new View.OnClickListener() {
                @Override

                public void onClick(View v){
                    Intent intent = new Intent(LoginActivity.this,
                            MenuActivity.class);
                    startActivity(intent);


                }
            });
        }}

        }

