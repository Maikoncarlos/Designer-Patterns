package com.github.maikoncarlo.designer.patterns.pedido;

import com.github.maikoncarlo.designer.patterns.orcamento.Orcamento;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.function.Consumer;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

@ExtendWith (MockitoExtension.class)
class GerarPedidoHandlerTest {

    @InjectMocks
    private GerarPedidoHandler gerarPedidoHandler;

    @Mock
    private List<AcoesAposGerarPedido> acoes;

    @Test
    void testExecutar() {
        // Setup
        final var pedido = new GerarPedido("cliente", new BigDecimal("450.00"), 6);
        final var orcamento = new Orcamento(new BigDecimal("450.00"), 6);
        final var novoPedido = new Pedido("cliente", LocalDateTime.now(), orcamento);
        // Run the test
        gerarPedidoHandler.executar(pedido);

        // Verify the results
        verify(acoes).forEach(any(Consumer.class));
    }
}
