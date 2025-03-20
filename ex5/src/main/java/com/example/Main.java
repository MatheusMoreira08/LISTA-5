package com.example;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
            new Produto("Produto A", 10.5),
            new Produto("Produto B", 20.0),
            new Produto("Produto C", 30.75),
            new Produto("Produto D", 15.25)
        );

        // Criar lista intermediária com os preços
        List<Double> precos = produtos.stream()
                                      .map(Produto::getPreco)
                                      .collect(Collectors.toList());

        // Somar os preços
        double soma = produtos.stream()
                              .collect(Collectors.summingDouble(Produto::getPreco));

        // Calcular a média dos preços
        double media = produtos.stream()
                               .collect(Collectors.averagingDouble(Produto::getPreco));

        // Exibir resultados
        System.out.println("Lista de preços: " + precos);
        System.out.println("Soma total dos preços: " + soma);
        System.out.println("Média dos preços: " + media);
    }
}