package com.github.maikoncarlo.Designer.Patterns.imposto;

import com.github.maikoncarlo.Designer.Patterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoImposto) {
        switch (tipoImposto) {
            case ICMS -> {
                return orcamento.valor().multiply(BigDecimal.valueOf(0.1));
            }
            case ISS -> {
                return orcamento.valor().multiply(BigDecimal.valueOf(0.06));
            }
            default -> {
                return BigDecimal.ZERO;
            }
        }
    }
}
