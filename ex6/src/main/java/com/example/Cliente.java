package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Cliente {
    private String nome;
    private int idade;

    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}