package com.github.maikoncarlo.designer.patterns.controller;

import com.github.maikoncarlo.designer.patterns.service.imposto.ICalculadoraDeImpostos;
import com.github.maikoncarlo.designer.patterns.service.imposto.TipoImpostoEnum;
import com.github.maikoncarlo.designer.patterns.service.Orcamento;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequiredArgsConstructor
public class CalculadorImpostoController {

    private final ICalculadoraDeImpostos calculadoraDeImpostos;

    @GetMapping(value = "/calculo-imposto")
    public ResponseEntity calculaImposto(@RequestBody Orcamento orcamento, @RequestParam(value = "imposto") TipoImpostoEnum imposto) {
        BigDecimal calcular = calculadoraDeImpostos.calcular(orcamento, imposto);
        return ResponseEntity.ok().body(calcular);
    }
}
