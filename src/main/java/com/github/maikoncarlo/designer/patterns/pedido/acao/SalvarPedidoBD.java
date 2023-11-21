package com.github.maikoncarlo.designer.patterns.pedido.acao;

import com.github.maikoncarlo.designer.patterns.pedido.AcoesAposGerarPedido;
import com.github.maikoncarlo.designer.patterns.pedido.Pedido;

public class SalvarPedidoBD implements AcoesAposGerarPedido {
    public void executar(Pedido pedido) {
        System.out.println("Enviar email para cliente com os dados e situação do pedido: " + pedido);
    }
}
