package com.example;

class Pessoa implements Descritivel {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String getDescricao() {
        return nome + " tem " + idade + " anos";
    }
}
