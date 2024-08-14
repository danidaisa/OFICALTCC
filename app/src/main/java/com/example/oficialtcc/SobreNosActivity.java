package com.example.oficialtcc;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class SobreNosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sobrenos_activity); // Substitua por seu arquivo XML

        // Configuração da Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Se você quiser adicionar funcionalidades adicionais para a Toolbar, como um botão de voltar
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true); // Exibe o botão de voltar
            getSupportActionBar().setHomeButtonEnabled(true); // Habilita o botão de voltar
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        // Comportamento do botão de voltar
        onBackPressed();
        return true;
    }
}
