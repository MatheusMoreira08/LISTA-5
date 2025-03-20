package com.example;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = Arrays.asList(
            new Pessoa("Ana", 25),
            new Pessoa("Carlos", 35),
            new Pessoa("Beatriz", 17),
            new Pessoa("Daniel", 40),
            new Pessoa("Elisa", 19)
        );

        // Criar uma lista intermediária contendo apenas descrições das pessoas
        List<String> descricoes = pessoas.stream()
            .map(Pessoa::getDescricao)
            .collect(Collectors.toList());

        // Concatenar todas as descrições em uma única string separada por vírgulas
        String descricaoConcatenada = pessoas.stream()
            .map(Pessoa::getDescricao)
            .collect(Collectors.joining(", "));

        // Exibir resultados
        System.out.println("Descrições individuais:");
        descricoes.forEach(System.out::println);
        
        System.out.println("\nDescrição concatenada:");
        System.out.println(descricaoConcatenada);
    }
}