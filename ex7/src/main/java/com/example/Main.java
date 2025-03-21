package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Optional;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
                new Produto("Celular", 1500.00),
                new Produto("Notebook", 3500.00),
                new Produto("Mouse", 100.00),
                new Produto("Teclado", 200.00),
                new Produto("Monitor", 800.00));

        // Encontrar o produto mais caro
        Optional<Produto> produtoMaisCaro = produtos.stream()
                .collect(Collectors.maxBy(Comparator.comparingDouble(Produto::getPreco)));

        // Encontrar o produto mais barato
        Optional<Produto> produtoMaisBarato = produtos.stream()
                .collect(Collectors.minBy(Comparator.comparingDouble(Produto::getPreco)));

        // Criar uma lista apenas com os nomes dos produtos
        List<String> nomesProdutos = produtos.stream()
                .map(Produto::getNome)
                .collect(Collectors.toList());

        // Exibir resultados
        produtoMaisCaro
                .ifPresent(p -> System.out.println("Produto mais caro: " + p.getNome() + " - R$ " + p.getPreco()));
        produtoMaisBarato
                .ifPresent(p -> System.out.println("Produto mais barato: " + p.getNome() + " - R$ " + p.getPreco()));

        System.out.println("\nLista de nomes dos produtos:");
        nomesProdutos.forEach(System.out::println);
    }
}