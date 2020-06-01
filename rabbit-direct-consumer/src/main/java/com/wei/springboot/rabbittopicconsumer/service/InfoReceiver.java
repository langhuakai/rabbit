package com.wei.springboot.rabbittopicconsumer.service;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Service;

@Service
@RabbitListener(
        bindings = @QueueBinding(
                value = @Queue(value = "${mq.config.queue.info}", autoDelete = "true"),
                exchange = @Exchange(value = "${mq.config.exchange}", type = ExchangeTypes.DIRECT),
                key = "${mq.config.queue.info.key}"
        )
)
public class InfoReceiver {

    @RabbitHandler
    public void process(String message) {
        System.out.println("接收到info日志" + message);
    }
}
