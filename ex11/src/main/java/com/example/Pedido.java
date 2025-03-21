package com.example;

public class Pedido {

    private int id;
    private String cliente;
    private String status;

    public Pedido(int id, String cliente, String status) {
        this.id = id;
        this.cliente = cliente;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", cliente='" + cliente + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
