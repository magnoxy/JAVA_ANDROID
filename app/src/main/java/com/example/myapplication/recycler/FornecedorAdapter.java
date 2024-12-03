package com.example.myapplication.recycler;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.FornecedorDetalhesActivity;
import com.example.myapplication.R;
import com.example.myapplication.entity.Fornecedor;

import java.util.List;

public class FornecedorAdapter extends RecyclerView.Adapter<FornecedorAdapter.FornecedorViewHolder> {
    private Context context;
    private List<Fornecedor> fornecedores;

    public FornecedorAdapter(Context context, List<Fornecedor> fornecedores) {
        this.context = context;
        this.fornecedores = fornecedores;
    }

    @NonNull
    @Override
    public FornecedorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate o layout do item da lista
        View view = LayoutInflater.from(context).inflate(R.layout.item_fornecedor, parent, false);
        return new FornecedorViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FornecedorViewHolder holder, int position) {
        Fornecedor fornecedor = fornecedores.get(position);
        holder.textViewNome.setText(fornecedor.getNome());

        // Configura o clique no item
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, FornecedorDetalhesActivity.class);
            intent.putExtra("fornecedor", fornecedor); // Passa o objeto fornecedor
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return fornecedores.size();
    }

    static class FornecedorViewHolder extends RecyclerView.ViewHolder {
        TextView textViewNome;

        public FornecedorViewHolder(@NonNull View itemView) {
            super(itemView);
            // Inicializa o TextView a partir do layout inflado
            textViewNome = itemView.findViewById(R.id.textViewNome);
        }
    }
}
