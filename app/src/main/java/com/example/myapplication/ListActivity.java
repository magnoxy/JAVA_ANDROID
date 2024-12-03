package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.entity.Fornecedor;
import com.example.myapplication.recycler.FornecedorAdapter;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2)); // 2 colunas no GridLayout

        List<Fornecedor> fornecedores = new ArrayList<>();
        fornecedores.add(new Fornecedor(1, "Fornecedor A", "123456789", "a@fornecedor.com", "Endereço A"));
        fornecedores.add(new Fornecedor(2, "Fornecedor B", "987654321", "b@fornecedor.com", "Endereço B"));
        fornecedores.add(new Fornecedor(3, "Fornecedor C", "456123789", "c@fornecedor.com", "Endereço C"));

        FornecedorAdapter adapter = new FornecedorAdapter(this, fornecedores);
        recyclerView.setAdapter(adapter);





    }
}
