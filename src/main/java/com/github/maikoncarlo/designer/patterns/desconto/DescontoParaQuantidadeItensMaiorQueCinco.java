package com.github.maikoncarlo.designer.patterns.desconto;

import com.github.maikoncarlo.designer.patterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaQuantidadeItensMaiorQueCinco extends Desconto {

    public DescontoParaQuantidadeItensMaiorQueCinco(Desconto proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(BigDecimal.valueOf(0.05));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeitens() > 5;
    }
}
