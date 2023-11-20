package com.github.maikoncarlo.designer.patterns.pedido;

import com.github.maikoncarlo.designer.patterns.orcamento.Orcamento;

import java.time.LocalDateTime;

public class GerarPedidoHandler {

    public void executar(GerarPedido pedido){
        var orcamento = new Orcamento(pedido.getValorOrcamento(), pedido.getQuantidadeItens());
        var novoPedido = new Pedido(pedido.getCliente(), LocalDateTime.now(), orcamento );

        System.out.println("Chama a Classe para Salvar/Atualizar pedido no banco de Dados" + novoPedido);
        System.out.println("Chama a Classe para Enviar email para cliente com os dados e situação do pedido" + novoPedido);
    }
}
