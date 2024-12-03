package com.example.myapplication.entity;

import java.io.Serializable;

public class Fornecedor implements Serializable {
    private int id;
    private String nome;
    private String telefone;
    private String email;
    private String endereco;

    public Fornecedor(int id, String nome, String telefone, String email, String endereco) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }
}
