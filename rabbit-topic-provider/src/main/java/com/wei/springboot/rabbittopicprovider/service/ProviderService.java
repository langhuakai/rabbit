package com.wei.springboot.rabbittopicprovider.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ProviderService {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Value("${mq.config.exchange}")
    private String exchange;

    @Value("${mq.config.queue.info.key}")
    private String key;

    public void send(String message) {
        amqpTemplate.convertAndSend(this.exchange, key, message);
    }
}
