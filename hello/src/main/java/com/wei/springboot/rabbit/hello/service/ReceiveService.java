package com.wei.springboot.rabbit.hello.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class ReceiveService {

    @RabbitListener(queues = "hello-queue")
    public void receive(String message) {
        System.out.println(message + "----------------------------------------------------------------------");
    }
}
