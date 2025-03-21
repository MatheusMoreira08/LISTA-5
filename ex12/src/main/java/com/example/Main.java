package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = Arrays.asList(
                new Funcionario("Carlos", 5000, "TI"),
                new Funcionario("Mariana", 4500, "RH"),
                new Funcionario("João", 6000, "TI"),
                new Funcionario("Ana", 7000, "Financeiro"),
                new Funcionario("Pedro", 5500, "TI"),
                new Funcionario("Lucas", 4800, "RH"));

        // Criar lista intermediária contendo apenas funcionários do departamento "TI"
        List<Funcionario> funcionariosTI = funcionarios.stream()
                .filter(f -> f.getDepartamento().equalsIgnoreCase("TI"))
                .collect(Collectors.toList());

        // Aplicar aumento de 10% nos salários
        List<Funcionario> funcionariosComAumento = funcionarios.stream()
                .map(f -> new Funcionario(f.getNome(), f.getSalario() * 1.1, f.getDepartamento()))
                .collect(Collectors.toList());

        // Criar um Map<String, Double> contendo o total dos salários por departamento
        Map<String, Double> totalSalariosPorDepartamento = funcionariosComAumento.stream()
                .collect(Collectors.groupingBy(Funcionario::getDepartamento,
                        Collectors.summingDouble(Funcionario::getSalario)));

        // Exibir os resultados
        System.out.println("Funcionários do departamento 'TI':");
        funcionariosTI.forEach(System.out::println);

        System.out.println("\nFuncionários com aumento de 10%:");
        funcionariosComAumento.forEach(System.out::println);

        System.out.println("\nTotal dos salários por departamento:");
        totalSalariosPorDepartamento
                .forEach((dep, total) -> System.out.println(dep + ": R$ " + String.format("%.2f", total)));
    }
}
