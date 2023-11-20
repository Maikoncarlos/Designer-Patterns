package com.github.maikoncarlo.designer.patterns.orcamento;

import com.github.maikoncarlo.designer.patterns.orcamento.situacao.*;

import java.math.BigDecimal;

public class Orcamento {
    private BigDecimal valor;
    private Integer quantidadeitens;
    private SituacaoOrcamento situacao;

    public Orcamento(BigDecimal valor, Integer quantidadeItens) {
        this.valor = valor;
        this.quantidadeitens = quantidadeItens;
        this.situacao = new EmAnalise();
    }

    public void aplicarDescontoExtra() {
        BigDecimal valorDescontoExtra = this.situacao.calcularValorDescontoExtra(this);

        this.valor = this.valor.subtract(valorDescontoExtra);
    }

    public void aprovar() {
        this.situacao.aprovar(this);
    }

    public void reprovar() {
        this.situacao.reprovar(this);
    }

    public void finalizar() {
        this.situacao.finalizar(this);
    }

    public SituacaoOrcamento getSituacao() {
        return situacao;
    }

    public void setSituacao(Aprovado aprovado) {
        this.situacao = aprovado;
    }

    public void setSituacao(Reprovado reprovado) {
        this.situacao = reprovado;
    }

    public void setSituacao(Finalizado finalizado) {
        this.situacao = finalizado;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Integer getQuantidadeitens() {
        return quantidadeitens;
    }

    @Override
    public String toString() {
        return "Orcamento{" +
                "valor=" + valor +
                ", quantidadeItens=" + quantidadeitens +
                '}';
    }
}