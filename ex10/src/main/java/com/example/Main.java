package com.example;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Optional;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {
        List<Vendedor> vendedores = Arrays.asList(
            new Vendedor("Ana", 15000.0),
            new Vendedor("Bruno", 8000.0),
            new Vendedor("Carlos", 12000.0),
            new Vendedor("Daniela", 9500.0),
            new Vendedor("Eduardo", 20000.0)
        );

        // Filtrar vendedores com vendas acima de R$ 10.000,00
        List<Vendedor> vendedoresFiltrados = vendedores.stream()
            .filter(v -> v.getTotalVendas() > 10000.0)
            .collect(Collectors.toList());
        
        System.out.println("Vendedores com mais de R$ 10.000,00 em vendas:");
        vendedoresFiltrados.forEach(System.out::println);

        // Encontrar o maior total de vendas
        Optional<Vendedor> maiorVenda = vendedores.stream()
            .collect(Collectors.maxBy(Comparator.comparingDouble(Vendedor::getTotalVendas)));
        
        // Encontrar o menor total de vendas
        Optional<Vendedor> menorVenda = vendedores.stream()
            .collect(Collectors.minBy(Comparator.comparingDouble(Vendedor::getTotalVendas)));
        
        System.out.println("\nMaior venda: " + maiorVenda.orElse(null));
        System.out.println("Menor venda: " + menorVenda.orElse(null));

        // Criar lista contendo apenas os nomes dos vendedores
        List<String> nomesVendedores = vendedores.stream()
            .map(Vendedor::getNome)
            .collect(Collectors.toList());
        
        System.out.println("\nLista de nomes dos vendedores:");
        nomesVendedores.forEach(System.out::println);
    }
}