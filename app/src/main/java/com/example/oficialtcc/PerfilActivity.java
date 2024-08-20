package com.example.oficialtcc;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class PerfilActivity extends AppCompatActivity {

    private static final int EDIT_PROFILE_REQUEST = 1;
    private TextView profileName;
    private TextView profileEmail;
    private String name = "João da Silva"; // Dados iniciais do perfil
    private String email = "joao.silva@example.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perfil_activity);

        // Referências aos componentes
        ImageView profileImage = findViewById(R.id.perfilImage);
        profileName = findViewById(R.id.perfilName);
        profileEmail = findViewById(R.id.perfilEmail);
        Button editProfileButton = findViewById(R.id.editPerfilBtn);

        // Definir os dados iniciais no layout
        profileName.setText(name);
        profileEmail.setText(email);

        // Configurar o botão de edição
        editProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Abrir a atividade de edição
                Intent intent = new Intent(MainActivity.this, EditPerfilActivity.class);
                // Passar os dados para a nova atividade
                intent.putExtra("name", name);
                intent.putExtra("email", email);
                startActivityForResult(intent, EDIT_PROFILE_REQUEST);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == EDIT_PROFILE_REQUEST && resultCode == RESULT_OK) {
            // Receber os dados atualizados
            String newName = data.getStringExtra("newName");
            String newEmail = data.getStringExtra("newEmail");

            // Atualizar os TextViews com os novos dados
            profileName.setText(newName);
            profileEmail.setText(newEmail);
        }
    }
}