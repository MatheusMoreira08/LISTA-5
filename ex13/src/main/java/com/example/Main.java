package com.example;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Livro> livros = Arrays.asList(
                new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 120.50),
                new Livro("1984", "George Orwell", 45.90),
                new Livro("Dom Casmurro", "Machado de Assis", 39.90),
                new Livro("A Revolução dos Bichos", "George Orwell", 29.90),
                new Livro("O Hobbit", "J.R.R. Tolkien", 59.90),
                new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 69.90));

        // Ordenar a lista por preço crescente e, em seguida, por autor em ordem
        // alfabética
        List<Livro> livrosOrdenados = livros.stream()
                .sorted(Comparator.comparingDouble(Livro::getPreco)
                        .thenComparing(Livro::getAutor))
                .collect(Collectors.toList());

        // Criar lista intermediária contendo apenas os títulos dos livros
        List<String> titulosLivros = livrosOrdenados.stream()
                .map(Livro::getTitulo)
                .collect(Collectors.toList());

        // Criar uma única string contendo os títulos separados por " | "
        String titulosConcatenados = titulosLivros.stream()
                .collect(Collectors.joining(" | "));

        // Exibir os resultados
        System.out.println("Livros ordenados por preço e autor:");
        livrosOrdenados.forEach(System.out::println);

        System.out.println("\nLista de títulos dos livros:");
        titulosLivros.forEach(System.out::println);

        System.out.println("\nTítulos concatenados:");
        System.out.println(titulosConcatenados);
    }
}