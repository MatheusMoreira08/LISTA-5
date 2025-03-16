package com.example;

public class PedidoDTO {
    private int id;
    private double valorTotal;

    public PedidoDTO(int id, double valorTotal) {
        this.id = id;
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "PedidoDTO { id=" + id + ", valorTotal=" + valorTotal + " }";
    }

}
