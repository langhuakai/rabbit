##RabbitMQ
###用法
1.引入jar包
<!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-amqp -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-amqp</artifactId>
            <version>2.2.6.RELEASE</version>
        </dependency>
2.在application.yml中添加rabbitMQ的配置（ip 端口 账号 密码）
3.添加Queue的配置
4.在接收的方法上添加@RabbitListener注解监听对应的Queue       