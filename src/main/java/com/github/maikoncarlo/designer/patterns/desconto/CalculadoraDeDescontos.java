package com.github.maikoncarlo.designer.patterns.desconto;

import com.github.maikoncarlo.designer.patterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento) {

        if (orcamento.quantidadeIten() > 5)
            return orcamento.valor().multiply(BigDecimal.valueOf(0.05));

        if (orcamento.valor().compareTo(BigDecimal.valueOf(500.00)) > 0)
            return orcamento.valor().multiply(BigDecimal.valueOf(0.1));

        return BigDecimal.ZERO;
    }
}
