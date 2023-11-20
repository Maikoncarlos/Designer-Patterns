package com.github.maikoncarlo.designer.patterns.orcamento.situacao;

import com.github.maikoncarlo.designer.patterns.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {

    public void finalizar(Orcamento orcamento){
        orcamento.setSituacao(new Finalizado());
    }

}
