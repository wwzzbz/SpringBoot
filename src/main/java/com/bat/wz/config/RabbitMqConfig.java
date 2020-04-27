package com.bat.wz.config;

import com.bat.wz.dto.QueueEnum;
import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname RabbitMqConfig
 * @Description rabbitMq配置类
 * @Date 2020/4/27 17:24
 * @Created by wz
 */
@Configuration
public class RabbitMqConfig {

    /**
     * 订单消息实际消费队列所绑定的交换机
     */
    @Bean
    public DirectExchange directExchange(){
        return (DirectExchange) ExchangeBuilder.directExchange(QueueEnum.QUEUE_ORDER_CANCEL.getExchange()).durable(true).build();
    }
    /**
     * 订单延迟队列队列所绑定的交换机
     */
    @Bean
    public DirectExchange ttlDirectExchange() {
        return (DirectExchange) ExchangeBuilder
                .directExchange(QueueEnum.QUEUE_TTL_ORDER_CANCEL.getExchange())
                .durable(true)
                .build();
    }
    /**
     * 订单消息消费队列
     */
    @Bean
    public Queue queue(){
        return new Queue(QueueEnum.QUEUE_ORDER_CANCEL.getName());
    }
    @Bean
    public Queue ttlQueue(){
        return QueueBuilder.durable(QueueEnum.QUEUE_TTL_ORDER_CANCEL.getName())
                .withArgument("x-dead-letter-exchange",QueueEnum.QUEUE_TTL_ORDER_CANCEL.getExchange())//到期后转发的交换机
                .withArgument("x-dead-letter-routing-key",QueueEnum.QUEUE_TTL_ORDER_CANCEL.getRouteKey())//到期后转发的路由键
                .build();
    }
    @Bean
    public Binding bind( Queue queue, DirectExchange exchange){
        return BindingBuilder.bind(queue).to(exchange).with(QueueEnum.QUEUE_ORDER_CANCEL.getRouteKey());
    }
    /**
     * 将订单延迟队列绑定到交换机
     */
    @Bean
    Binding orderTtlBinding(DirectExchange orderTtlDirect,Queue orderTtlQueue){
        return BindingBuilder
                .bind(orderTtlQueue)
                .to(orderTtlDirect)
                .with(QueueEnum.QUEUE_TTL_ORDER_CANCEL.getRouteKey());
    }
}
