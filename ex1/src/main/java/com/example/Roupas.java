package com.example;

public class Roupas extends ItemLoja {
    private double preco;

    public Roupas(int id, String nome, double preco) {
        super(id, nome);
        this.preco = preco;
    }

    @Override 
    public double getPreco() {
        return preco;
    }
}
