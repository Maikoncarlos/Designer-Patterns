package com.github.maikoncarlo.designer.patterns.pedido.acao;

import com.github.maikoncarlo.designer.patterns.pedido.AcoesAposGerarPedido;
import com.github.maikoncarlo.designer.patterns.pedido.Pedido;

public class EnviarEmailPedido implements AcoesAposGerarPedido {

    public void executar(Pedido pedido){
        System.out.println("Salvar/Atualizar pedido no banco de Dados: " + pedido);
    }

}
