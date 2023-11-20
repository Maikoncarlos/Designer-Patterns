package com.github.maikoncarlo.designer.patterns.desconto;

import com.github.maikoncarlo.designer.patterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento) {

        var desconto = new DescontoParaQuantidadeItensMaiorQueCinco(
                new DescontoParaValorOrcamentoMaiorQueQuinhentosReais(
                        new SemDesconto()));

        return desconto.calcular(orcamento);
    }
}
