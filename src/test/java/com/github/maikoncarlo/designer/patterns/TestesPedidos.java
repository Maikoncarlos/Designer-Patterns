package com.github.maikoncarlo.designer.patterns;

import com.github.maikoncarlo.designer.patterns.pedido.GerarPedido;
import com.github.maikoncarlo.designer.patterns.pedido.GerarPedidoHandler;
import com.github.maikoncarlo.designer.patterns.pedido.acao.EnviarEmailPedido;
import com.github.maikoncarlo.designer.patterns.pedido.acao.SalvarPedidoBD;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestesPedidos {

    public static void main(String[] args) {
        String cliente = "cliente";
        BigDecimal valorOrcamento = BigDecimal.valueOf(450);
        Integer qtddItens = 6;

        var geradorPedido = new GerarPedido(cliente, valorOrcamento, qtddItens);
        var handler = new GerarPedidoHandler(Arrays.asList(new SalvarPedidoBD(), new EnviarEmailPedido()));

        handler.executar(geradorPedido);
    }
}
