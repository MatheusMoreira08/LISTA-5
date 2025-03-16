package com.example;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Pedido> pedidos = List.of(
            new Pedido(1, "João", 250.75),
            new Pedido(2, "Maria", 180.50),
            new Pedido(3, "Carlos", 300.00)
        );

        List<PedidoDTO> pedidosDTO = pedidos.stream()
            .map(p -> new PedidoDTO(p.getId(), p.getValorTotal()))
            .collect(Collectors.toList());

        pedidosDTO.forEach(System.out::println);
    }
}