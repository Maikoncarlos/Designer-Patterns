package com.github.maikoncarlo.designer.patterns.service.imposto;

import com.github.maikoncarlo.designer.patterns.service.Orcamento;

import java.math.BigDecimal;

public class ICMS implements ICalculadoraDeImpostos{

    @Override
    public BigDecimal calcular(Orcamento orcamento, TipoImpostoEnum tipoImposto) {
        return null;
    }
}
