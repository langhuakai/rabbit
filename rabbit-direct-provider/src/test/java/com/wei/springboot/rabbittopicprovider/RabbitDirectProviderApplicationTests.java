package com.wei.springboot.rabbittopicprovider;

import com.wei.springboot.rabbittopicprovider.service.ProviderService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RabbitDirectProviderApplicationTests {


    private ProviderService providerService;
    @Test
    public void sendTest() {
        providerService.send("发送数据到rabbitMQ中");
    }
    @Test
    void contextLoads() {
    }

}
