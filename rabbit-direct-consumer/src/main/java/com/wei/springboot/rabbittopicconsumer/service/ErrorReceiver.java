package com.wei.springboot.rabbittopicconsumer.service;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Service;

@Service
@RabbitListener(
        bindings = @QueueBinding(
                value = @Queue(value = "${mq.config.queue.error}", autoDelete = "true"),
                exchange = @Exchange(value = "${mq.config.exchange}", type = ExchangeTypes.DIRECT),
                key = "${mq.config.queue.error.key}"
        )
)
public class ErrorReceiver {

    @RabbitHandler
    public void process(String message) {
        System.out.println("接收到error日志" + message);
    }
}
