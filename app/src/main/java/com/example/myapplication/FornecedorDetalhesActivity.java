package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.entity.Fornecedor;

public class FornecedorDetalhesActivity extends AppCompatActivity {
    private TextView textViewDetalhes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fornecedor_detalhes);

        textViewDetalhes = findViewById(R.id.textViewDetalhes);

        // Recupera o fornecedor enviado pelo Intent
        Fornecedor fornecedor = (Fornecedor) getIntent().getSerializableExtra("fornecedor");
        if (fornecedor != null) {
            // Exibe os detalhes do fornecedor
            String detalhes = "Nome: " + fornecedor.getNome() + "\n" +
                    "Telefone: " + fornecedor.getTelefone() + "\n" +
                    "Email: " + fornecedor.getEmail() + "\n" +
                    "Endereço: " + fornecedor.getEndereco();
            textViewDetalhes.setText(detalhes);
        }
    }

}
