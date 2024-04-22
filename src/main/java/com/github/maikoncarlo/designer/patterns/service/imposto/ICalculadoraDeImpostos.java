package com.github.maikoncarlo.designer.patterns.service.imposto;

import com.github.maikoncarlo.designer.patterns.service.Orcamento;

import java.math.BigDecimal;

public interface ICalculadoraDeImpostos {

    BigDecimal calcular(Orcamento orcamento, TipoImpostoEnum tipoImposto);
}