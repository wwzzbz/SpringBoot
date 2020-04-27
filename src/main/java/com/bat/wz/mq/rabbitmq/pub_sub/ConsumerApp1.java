package com.bat.wz.mq.rabbitmq.pub_sub;

import jdk.nashorn.internal.ir.annotations.Immutable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.messaging.handler.annotation.Payload;

/**
 * @Classname ConsumerApp1
 * @Description TODO
 * @Date 2020/4/27 9:59
 * @Created by wz
 */
@Configuration
@EnableAutoConfiguration
@Import(AppConfiguration.class)
@RabbitListener(queues = "#{queue.name}")
public class ConsumerApp1 {
    private static final Logger LOGGER = LoggerFactory.getLogger(ConsumerApp1.class);
    @RabbitHandler
    public void receive(@Payload String msg){
        LOGGER.info("接收到消息："+msg);
    }

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(ConsumerApp1.class);
        application.setAdditionalProfiles("consumer");
        application.run(args);
    }
}
