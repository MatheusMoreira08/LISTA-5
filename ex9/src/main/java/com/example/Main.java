package com.example;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        // Criar lista de produtos
        List<Produto> produtos = Arrays.asList(
            new Produto(1, "Celular", 1500.00),
            new Produto(2, "Notebook", 3500.00),
            new Produto(3, "Mouse", 100.00),
            new Produto(4, "Teclado", 200.00),
            new Produto(5, "Monitor", 800.00)
        );

        // Converter a lista de produtos em um Map com id como chave
        Map<Integer, Produto> produtoMap = produtos.stream()
            .collect(Collectors.toMap(Produto::getId, p -> p));

        // Exibir o mapa de produtos
        System.out.println("Mapa de Produtos:");
        produtoMap.forEach((id, produto) -> 
            System.out.println("ID: " + id + " - " + produto.getNome() + " - R$ " + produto.getPreco())
        );
    }
}