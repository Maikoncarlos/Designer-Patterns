package com.github.maikoncarlo.Designer.Patterns;

import com.github.maikoncarlo.Designer.Patterns.imposto.CalculadoraDeImpostos;
import com.github.maikoncarlo.Designer.Patterns.imposto.TipoImposto;
import com.github.maikoncarlo.Designer.Patterns.orcamento.Orcamento;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static java.lang.Integer.valueOf;

@SpringBootTest
class DesignerPatternsApplicationTests {

	@Test
	@DisplayName(value = "deve retornar o valor do imposto de ICMS com sucesso")
	void testeImposto_ICMS() {

		var value = BigDecimal.valueOf(100);
		var orcamento = new Orcamento(value);

		var calculadora = new CalculadoraDeImpostos();
		var atual = calculadora.calcular(orcamento, TipoImposto.ICMS);

		var expected = BigDecimal.valueOf(10.00);
		Assertions.assertEquals(expected, atual, "erro no resultado esperado");

	}

}
