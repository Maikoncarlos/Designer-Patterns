package com.github.maikoncarlo.designer.patterns.pedido;

import java.math.BigDecimal;

public class GerarPedido {
    private String cliente;
    private BigDecimal valorOrcamento;
    private Integer quantidadeItens;

    public String getCliente() {
        return cliente;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public Integer getQuantidadeItens() {
        return quantidadeItens;
    }

    public GerarPedido(String cliente, BigDecimal valorOrcamento, Integer quantidadeItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidadeItens = quantidadeItens;
    }

}
