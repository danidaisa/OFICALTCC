package com.example.oficialtcc;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class CadastroActivity<DatabaseHelper> extends AppCompatActivity {

    private EditText editTextEmail;
    private EditText editTextName;
    private EditText editTextPassword;
    private Button buttonRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_activity);


                // Configura o clique do botão de cadastro
                buttonRegister.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        registerUser();
                    }
                });
            }

            private void registerUser() {
                // Obtém os valores dos campos
                String email = editTextEmail.getText().toString().trim();
                String name = editTextName.getText().toString().trim();
                String password = editTextPassword.getText().toString().trim();

                // Validação dos campos
                if (email.isEmpty()) {
                    editTextEmail.setError("Campo obrigatório");
                    return;
                }

                if (name.isEmpty()) {
                    editTextName.setError("Campo obrigatório");
                    return;
                }

                if (password.isEmpty()) {
                    editTextPassword.setError("Campo obrigatório");
                    return;
                }}}