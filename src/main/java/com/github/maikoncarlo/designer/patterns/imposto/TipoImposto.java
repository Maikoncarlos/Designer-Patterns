package com.github.maikoncarlo.designer.patterns.imposto;

import com.github.maikoncarlo.designer.patterns.orcamento.Orcamento;

import java.math.BigDecimal;

public interface TipoImposto {
    BigDecimal calcular(Orcamento orcamento);
}
