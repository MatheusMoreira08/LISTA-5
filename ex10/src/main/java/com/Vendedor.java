package com;

import java.util.*;
import java.util.stream.Collectors;

class Vendedor {
    private String nome;
    private double totalVendas;

    public Vendedor(String nome, double totalVendas) {
        this.nome = nome;
        this.totalVendas = totalVendas;
    }

    public String getNome() {
        return nome;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    @Override
    public String toString() {
        return nome + " - R$ " + totalVendas;
    }
}
