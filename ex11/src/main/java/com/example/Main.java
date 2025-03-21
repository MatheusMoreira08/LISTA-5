package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Pedido> pedidos = Arrays.asList(
            new Pedido(1, "Carlos", "Pendente"),
            new Pedido(2, "Mariana", "Pago"),
            new Pedido(3, "João", "Cancelado"),
            new Pedido(4, "Ana", "Pago"),
            new Pedido(5, "Pedro", "Pendente"),
            new Pedido(6, "Lucas", "Pago")
        );

        // Criar lista intermediária contendo apenas os pedidos com status "Pago"
        List<Pedido> pedidosPagos = pedidos.stream()
            .filter(p -> p.getStatus().equalsIgnoreCase("Pago"))
            .collect(Collectors.toList());

        // Agrupar pedidos por status
        Map<String, List<Pedido>> pedidosPorStatus = pedidos.stream()
            .collect(Collectors.groupingBy(Pedido::getStatus));

        // Exibir os resultados
        System.out.println("Pedidos com status 'Pago':");
        pedidosPagos.forEach(System.out::println);

        System.out.println("\nPedidos agrupados por status:");
        pedidosPorStatus.forEach((status, lista) -> {
            System.out.println("\nStatus: " + status);
            lista.forEach(System.out::println);
        });
    }
    }
