package com.wei.springboot.rabbit.hello;

import com.wei.springboot.rabbit.hello.service.ReceiveService;
import com.wei.springboot.rabbit.hello.service.SendService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloApplicationTests {

    @Autowired
    private ReceiveService receiveService;
    @Autowired
    private SendService sendService;

    @Test
    public void sendTest() {
        sendService.send("发送数据到rabbitMQ中");
    }

    @Test
    void contextLoads() {
    }

}
