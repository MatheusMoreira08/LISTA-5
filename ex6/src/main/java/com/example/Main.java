package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Cliente> clientes = Arrays.asList(
                new Cliente("Ana", 25),
                new Cliente("Carlos", 35),
                new Cliente("Beatriz", 17),
                new Cliente("Daniel", 40),
                new Cliente("Elisa", 19));

        // Criar uma lista intermediária com clientes maiores de 18 anos
        List<Cliente> maioresDe18 = clientes.stream()
                .filter(c -> c.getIdade() > 18)
                .collect(Collectors.toList());

        // Contar quantos clientes possuem mais de 30 anos
        long countMaioresDe30 = clientes.stream()
                .filter(c -> c.getIdade() > 30)
                .count();

        // Criar uma lista apenas com os nomes dos clientes
        List<String> nomesClientes = clientes.stream()
                .map(Cliente::getNome)
                .collect(Collectors.toList());

        // Exibir resultados
        System.out.println("Clientes maiores de 18 anos:");
        maioresDe18.forEach(c -> System.out.println(c.getNome() + " - " + c.getIdade()));

        System.out.println("\nQuantidade de clientes com mais de 30 anos: " + countMaioresDe30);

        System.out.println("\nLista de nomes dos clientes:");
        nomesClientes.forEach(System.out::println);
    }
}