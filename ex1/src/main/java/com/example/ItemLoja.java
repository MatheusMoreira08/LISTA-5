package com.example;

public abstract class ItemLoja implements Vendaval {
    protected int id;
    protected String nome;

    public ItemLoja(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

}
