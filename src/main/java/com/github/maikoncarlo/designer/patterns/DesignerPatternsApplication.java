package com.github.maikoncarlo.designer.patterns;

import com.github.maikoncarlo.designer.patterns.imposto.CalculadoraDeImpostos;
import com.github.maikoncarlo.designer.patterns.imposto.ICMS;
import com.github.maikoncarlo.designer.patterns.imposto.ISS;
import com.github.maikoncarlo.designer.patterns.orcamento.Orcamento;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class DesignerPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignerPatternsApplication.class, args);
		var calculadoraDeImpostos = new CalculadoraDeImpostos();
		calculadoraDeImpostos.calcular(new Orcamento(BigDecimal.valueOf(1567.45), 1), new ICMS());
		calculadoraDeImpostos.calcular(new Orcamento(BigDecimal.valueOf(1000.45), 1), new ISS());
	}

}
