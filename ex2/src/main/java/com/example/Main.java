package com.example;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Aluno> alunos = List.of(
                new Aluno("João", 20, 7.5),
                new Aluno("Maria", 22, 8.0),
                new Aluno("José", 21, 6.5));

        List<Aluno> aprovadosOrdenados = alunos.stream()
                .filter(aluno -> aluno.getNota() >= 7)
                .sorted(Comparator.comparing(Aluno::getNota).reversed()
                        .thenComparing(Aluno::getIdade))
                .collect(Collectors.toList());

        List<String> nomesAprovados = aprovadosOrdenados.stream()
                .map(Aluno::getNome)
                .collect(Collectors.toList());

        System.out.println("Alunos aprovados ordenados:");
        aprovadosOrdenados.forEach(System.out::println);

        System.out.println("\nNomes dos alunos aprovados:");
        nomesAprovados.forEach(System.out::println);

    }
}