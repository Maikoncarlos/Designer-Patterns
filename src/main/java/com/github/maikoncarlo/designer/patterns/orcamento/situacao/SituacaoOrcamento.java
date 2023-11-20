package com.github.maikoncarlo.designer.patterns.orcamento.situacao;

import com.github.maikoncarlo.designer.patterns.exception.DomainException;
import com.github.maikoncarlo.designer.patterns.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento) {
        throw new DomainException("Orçamento NÃO pode ser aprovado!");
    }public void reprovar(Orcamento orcamento) {
        throw new DomainException("Orçamento NÃO pode ser reprovado!");
    }public void finalizar(Orcamento orcamento) {
        throw new DomainException("Orçamento NÃO pode ser finalizado!");
    }
}
