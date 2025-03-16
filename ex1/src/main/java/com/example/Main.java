package com.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<ItemLoja> produtos = Arrays.asList(
                new Eletronico(1, "Smartphone", 2000.00),
                new Eletronico(2, "Iphone", 5000.00),
                new Eletronico(3, "Notebook", 3000.00),
                new Roupas(4, "Camiseta", 120.00),
                new Roupas(5, "Bermuda", 89.99));

        List<String> nomesProdutosCaros = produtos.stream()
                .filter(produto -> produto.getPreco() > 100.00)
                .map(ItemLoja::getNome)
                .collect(Collectors.toList());

        System.out.println("Produtos com preço acima de R$ 100,00: " + nomesProdutosCaros);

    }
}