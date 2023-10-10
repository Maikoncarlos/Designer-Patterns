package com.github.maikoncarlo.designer.patterns.imposto;

import com.github.maikoncarlo.designer.patterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS implements TipoImposto {
    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.valor().multiply(BigDecimal.valueOf(0.06));
    }
}
