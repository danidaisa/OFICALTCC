package com.example.oficialtcc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.oficialtcc.R;

public class EditPerfilActivity extends AppCompatActivity {

    private EditText editName, editEmail;
    private Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_perfil);

        // Inicializar os componentes do layout
        editName = findViewById(R.id.editName);
        editEmail = findViewById(R.id.editEmail);
        saveButton = findViewById(R.id.saveButton);

        // Configurar ação do botão Salvar
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editName.getText().toString().trim();
                String email = editEmail.getText().toString().trim();

                if (validateInput(name, email)) {
                    // Aqui você pode adicionar a lógica para salvar os dados
                    Toast.makeText(EditPerfilActivity.this, "Dados salvos com sucesso!", Toast.LENGTH_SHORT).show();
                    // Finalizar a Activity (opcional)
                    finish();
                } else {
                    Toast.makeText(EditPerfilActivity.this, "Por favor, preencha todos os campos.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    // Método para validar o input do usuário
    private boolean validateInput(String name, String email) {
        return !name.isEmpty() && !email.isEmpty();
    }
}
