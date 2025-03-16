package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = Arrays.asList(
                new Funcionario("Carlos", 30, "Desenvolvedor", 5000.0),
                new Funcionario("Ana", 28, "Desenvolvedor", 5200.0),
                new Funcionario("Pedro", 40, "Gerente", 8000.0),
                new Funcionario("Mariana", 35, "Gerente", 8500.0),
                new Funcionario("João", 25, "Analista", 4500.0));

        Map<String, List<Funcionario>> funcionariosPorCargo = funcionarios.stream()
                .collect(Collectors.groupingBy(Funcionario::getCargo));

        System.out.println("Funcionários por cargo:");
        funcionariosPorCargo.forEach((cargo, lista) -> {
            System.out.println(cargo + ": " + lista.stream()
                    .map(Funcionario::getNome)
                    .collect(Collectors.joining(", ")));
        });

        List<String> nomes = funcionarios.stream()
                .map(Funcionario::getNome)
                .collect(Collectors.toList());

        System.out.println("\nLista de nomes dos funcionários: " + nomes);

        Map<String, Double> mediaSalarialPorCargo = funcionarios.stream()
                .collect(Collectors.groupingBy(
                        Funcionario::getCargo,
                        Collectors.averagingDouble(Funcionario::getSalario)));

        System.out.println("\nMédia salarial por cargo:");
        mediaSalarialPorCargo
                .forEach((cargo, media) -> System.out.println(cargo + ": R$ " + String.format("%.2f", media)));
    }
}
