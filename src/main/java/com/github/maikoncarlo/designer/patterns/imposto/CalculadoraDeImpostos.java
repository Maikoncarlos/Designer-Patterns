package com.github.maikoncarlo.designer.patterns.imposto;

import com.github.maikoncarlo.designer.patterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoImposto) {
        return tipoImposto.calcular(orcamento);
    }
}