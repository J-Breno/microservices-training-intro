package com.github.jbreno.pedidos.notificacao.listener;

import com.github.jbreno.pedidos.notificacao.entities.Pedido;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class PedidoListener {
    private final Logger logger = LoggerFactory.getLogger(PedidoListener.class);

    @RabbitListener(queues = "pedidos.v1.pedido-criado.gerar-notificacao")
    public void criarNotificacao(Pedido pedido) {
        logger.info("Notificação gerada: {}", pedido.toString());
    }
}
