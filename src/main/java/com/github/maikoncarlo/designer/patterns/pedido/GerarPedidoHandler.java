package com.github.maikoncarlo.designer.patterns.pedido;

import com.github.maikoncarlo.designer.patterns.orcamento.Orcamento;

import java.time.LocalDateTime;
import java.util.List;

public class GerarPedidoHandler {

    private List<AcoesAposGerarPedido> acoes;

    public GerarPedidoHandler(List<AcoesAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void executar(GerarPedido pedido){
        var orcamento = new Orcamento(pedido.getValorOrcamento(), pedido.getQuantidadeItens());
        var novoPedido = new Pedido(pedido.getCliente(), LocalDateTime.now(), orcamento );

        acoes.forEach(acoes -> acoes.executar(novoPedido));
    }
}

