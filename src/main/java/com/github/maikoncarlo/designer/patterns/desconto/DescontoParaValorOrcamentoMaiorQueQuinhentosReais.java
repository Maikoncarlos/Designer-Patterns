package com.github.maikoncarlo.designer.patterns.desconto;

import com.github.maikoncarlo.designer.patterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaValorOrcamentoMaiorQueQuinhentosReais extends Desconto{

    public DescontoParaValorOrcamentoMaiorQueQuinhentosReais(Desconto proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
         return orcamento.getValor().multiply(BigDecimal.valueOf(0.1));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(BigDecimal.valueOf(500.00)) > 0;
    }
}
