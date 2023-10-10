package com.github.maikoncarlo.designer.patterns.desconto;

import com.github.maikoncarlo.designer.patterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaValorOrcamentoMaiorQueQuinhentosReais extends Desconto{

    public DescontoParaValorOrcamentoMaiorQueQuinhentosReais(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.valor().compareTo(BigDecimal.valueOf(500.00)) > 0)
            return orcamento.valor().multiply(BigDecimal.valueOf(0.1));

        return proximo.calcular(orcamento);
    }
}
