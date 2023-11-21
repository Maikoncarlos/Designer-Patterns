package com.github.maikoncarlo.designer.patterns.pedido;

import com.github.maikoncarlo.designer.patterns.orcamento.Orcamento;

import java.time.LocalDateTime;

public class Pedido {
    private String cliente;
    private LocalDateTime data;
    private Orcamento orcamento;

    public String getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "cliente='" + cliente + '\'' +
                ", data=" + data +
                ", orcamento=" + orcamento +
                '}';
    }

    public LocalDateTime getData() {
        return data;
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }

    public Pedido(String cliente, LocalDateTime data, Orcamento orcamento) {
        this.cliente = cliente;
        this.data = data;
        this.orcamento = orcamento;
    }
}
