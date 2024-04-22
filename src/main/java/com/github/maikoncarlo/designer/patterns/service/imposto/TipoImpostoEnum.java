package com.github.maikoncarlo.designer.patterns.service.imposto;

import com.github.maikoncarlo.designer.patterns.service.Orcamento;

import java.math.BigDecimal;

public enum TipoImpostoEnum{

    ICMS(new ICMS()),
    ISS(new ISS());

    private ICalculadoraDeImpostos iCalculadoraDeImpostos;

    TipoImpostoEnum(ICalculadoraDeImpostos iCalculadoraDeImpostos){
    this.iCalculadoraDeImpostos = iCalculadoraDeImpostos;
    }
}


