package com.example.oficialtcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnButtonAtivity = findViewById(R.id.btn_iniciar);

        btnButtonAtivity.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this,
                        LoginActivity.class);
                startActivity(intent);


            }
        });
    }}