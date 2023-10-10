package com.github.maikoncarlo.designer.patterns;

import com.github.maikoncarlo.designer.patterns.imposto.CalculadoraDeImpostos;
import com.github.maikoncarlo.designer.patterns.imposto.ICMS;
import com.github.maikoncarlo.designer.patterns.imposto.ISS;
import com.github.maikoncarlo.designer.patterns.orcamento.Orcamento;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class DesignerPatternsApplicationTests {

	@Test
	@DisplayName(value = "deve retornar o valor do imposto de ICMS com sucesso")
	void testeImposto_ICMS() {

		var value = BigDecimal.valueOf(1567.45);
		var orcamento = new Orcamento(value);

		var calculadora = new CalculadoraDeImpostos();
		var atual = calculadora.calcular(orcamento, new ICMS());

		var expected = BigDecimal.valueOf(156.745);
		Assertions.assertEquals(expected, atual, "erro no resultado esperado");
	}

	@Test
	@DisplayName(value = "deve retornar o valor do imposto de ISS com sucesso")
	void testeImposto_ISS() {

		var value = BigDecimal.valueOf(1000.45);
		var orcamento = new Orcamento(value);

		var calculadora = new CalculadoraDeImpostos();
		var atual = calculadora.calcular(orcamento, new ISS());

		var expected = new BigDecimal("60.0270");
		Assertions.assertEquals(expected, atual, "erro no resultado esperado");
	}

}
