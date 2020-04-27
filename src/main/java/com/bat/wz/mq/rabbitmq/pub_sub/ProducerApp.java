package com.bat.wz.mq.rabbitmq.pub_sub;

import com.bat.wz.SpringbootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Classname ProducerApp
 * @Description TODO
 * @Date 2020/4/27 10:05
 * @Created by wz
 */
@Configuration
@EnableAutoConfiguration
@Import(AppConfiguration.class)
public class ProducerApp {
    private static final Logger LOGGER = LoggerFactory.getLogger(ConsumerApp2.class);

    @Autowired
    private RabbitTemplate template;
    @Autowired
    private FanoutExchange fanoutExchange;

    public CommandLineRunner runner(){
        return args -> {
            for (int i = 0; i < 10; i++) {
                StringBuilder builder = new StringBuilder("hello spring ");
                builder.append(i);
                String message = builder.toString();
                template.convertAndSend(fanoutExchange.getName(),"",message);
                LOGGER.info("已发送："+message);
            }
        };
    }

    public static void main(String[] args) {
        SpringApplication.exit(SpringApplication.run(ProducerApp.class,args));
    }
}
