package com.example.oficialtcc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class EditPerfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_perfil);

        // Referências aos componentes
        EditText editName = findViewById(R.id.editName);
        EditText editEmail = findViewById(R.id.editEmail);
        Button saveButton = findViewById(R.id.saveButton);

        // Receber os dados da intenção
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String email = intent.getStringExtra("email");

        // Preencher os campos com os dados recebidos
        editName.setText(name);
        editEmail.setText(email);

        // Configurar o botão de salvar
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obter os novos valores dos campos
                String newName = editName.getText().toString();
                String newEmail = editEmail.getText().toString();

                // Criar uma intenção para retornar os dados para a atividade principal
                Intent resultIntent = new Intent();
                resultIntent.putExtra("newName", newName);
                resultIntent.putExtra("newEmail", newEmail);
                setResult(RESULT_OK, resultIntent);
                finish(); // Finaliza a atividade e retorna para a atividade principal
            }
        });
    }
}
