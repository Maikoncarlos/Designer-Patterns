package com.github.maikoncarlo.designer.patterns.desconto;

import com.github.maikoncarlo.designer.patterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaQuantidadeItenMaiorQueCinco extends Desconto{

    public DescontoParaQuantidadeItenMaiorQueCinco(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento) {

        if (orcamento.quantidadeIten() > 5)
            return orcamento.valor().multiply(BigDecimal.valueOf(0.05));

        return proximo.calcular(orcamento);
    }
}
