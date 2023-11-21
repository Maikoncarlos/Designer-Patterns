package com.github.maikoncarlo.designer.patterns;

import com.github.maikoncarlo.designer.patterns.desconto.CalculadoraDeDescontos;
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
		var orcamento = new Orcamento(value, 1);

		var calculadora = new CalculadoraDeImpostos();
		var atual = calculadora.calcular(orcamento, new ICMS());

		var expected = BigDecimal.valueOf(156.745);
		Assertions.assertEquals(expected, atual, "erro no resultado esperado");
	}

	@Test
	@DisplayName(value = "deve retornar o valor do imposto de ISS com sucesso")
	void testeImposto_ISS() {

		var value = BigDecimal.valueOf(1000.45);
		var orcamento = new Orcamento(value, 1);

		var calculadora = new CalculadoraDeImpostos();
		var atual = calculadora.calcular(orcamento, new ISS());

		var expected = new BigDecimal("60.0270");
		Assertions.assertEquals(expected, atual, "erro no resultado esperado");
	}

	@Test
	@DisplayName(value = "deve retornar o valor do desconto quantidadeItens maior que 5 com sucesso")
	void testeDesconto_QtddMaiorQue5() {

		var value = BigDecimal.valueOf(1000.00);
		var orcamento = new Orcamento(value, 6);

		var calculadora = new CalculadoraDeDescontos();
		var atual = calculadora.calcular(orcamento);

		var expected = new BigDecimal("50.000");
		Assertions.assertEquals(expected, atual, "erro no resultado esperado");
	}

	@Test
	@DisplayName(value = "deve retornar o valor do desconto valor orcamento maior que 500.00 com sucesso")
	void testeDesconto_ValorMaiorQue500() {

		var value = BigDecimal.valueOf(1000.00);
		var orcamento = new Orcamento(value, 2);

		var calculadora = new CalculadoraDeDescontos();
		var atual = calculadora.calcular(orcamento);

		var expected = new BigDecimal("100.00");
		Assertions.assertEquals(expected, atual, "erro no resultado esperado");
	}

	@Test
	@DisplayName(value = "deve retornar Zero sem desconto com sucesso")
	void testeDesconto_SemDesconto() {

		var value = BigDecimal.valueOf(100.00);
		var orcamento = new Orcamento(value, 1);

		var calculadora = new CalculadoraDeDescontos();
		var atual = calculadora.calcular(orcamento);

		var expected = BigDecimal.ZERO;
		Assertions.assertEquals(expected, atual, "erro no resultado esperado");
	}




}
