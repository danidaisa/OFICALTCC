package com.example.oficialtcc;




import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class FaleConoscoActivity  extends AppCompatActivity {

        private EditText editTextQuestion;
        private Button buttonSend;
        private TextView textViewConfirmation;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.fale_conosco_activity); // Substitua pelo nome do seu arquivo XML

            // Inicializa os componentes
            editTextQuestion = findViewById(R.id.editTextQuestion);
            buttonSend = findViewById(R.id.btnenv);
            textViewConfirmation = findViewById(R.id.textViewConfirmation);

            // Configura o clique do botão
            buttonSend.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    sendQuestion();
                }
            });
        }

        private void sendQuestion() {
            // Obtém o texto do EditText
            String question = editTextQuestion.getText().toString().trim();

            // Verifica se o campo não está vazio
            if (!question.isEmpty()) {
                // Aqui você pode enviar a dúvida para um servidor, banco de dados, etc.
                // Para este exemplo, apenas exibe uma mensagem de confirmação
                textViewConfirmation.setVisibility(View.VISIBLE);

                // Limpa o campo de entrada
                editTextQuestion.setText("");

                // Opcional: oculta a mensagem de confirmação após alguns segundos
                textViewConfirmation.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        textViewConfirmation.setVisibility(View.GONE);
                    }
                }, 3000); // 3 segundos
            } else {
                // Opcional: mostrar uma mensagem de erro se o campo estiver vazio
                editTextQuestion.setError("Por favor, digite uma dúvida.");
            }
        }
    }


