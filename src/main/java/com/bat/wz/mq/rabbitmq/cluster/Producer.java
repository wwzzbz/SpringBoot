package com.bat.wz.mq.rabbitmq.cluster;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @Classname Producer
 * @Description TODO
 * @Date 2020/4/27 10:40
 * @Created by wz
 */
public class Producer {
    public static void main(String[] args) {
        //1 创建连接工厂
        ConnectionFactory factory = new ConnectionFactory();
        //2 设置连接属性
        factory.setUsername("order-user");
        factory.setPassword("order-user");
        factory.setVirtualHost("v1");
        //3 设置每个节点的连接地址和端口
        Address[] addresses = new Address[]{new Address("192.168.8.100",5672),
                new Address("192.168.8.100",5673)};
        Connection connection = null;
        Channel channel = null;
        try {
            // 设置断连自动恢复
            factory.setAutomaticRecoveryEnabled(true);
            // 设置每100毫秒尝试恢复一次
            factory.setNetworkRecoveryInterval(100);
            factory.setTopologyRecoveryEnabled(false);
            connection = factory.newConnection(addresses,"生产者");
            // 添加重连监听器
            ((Recoverable) connection).addRecoveryListener(new RecoveryListener() {
                /**
                 * 重连成功后的回调
                 * @param recoverable
                 */
                public void handleRecovery(Recoverable recoverable) {
                    System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SS").format(new Date()) + " 已重新建立连接！");
                }

                /**
                 * 开始重连时的回调
                 * @param recoverable
                 */
                public void handleRecoveryStarted(Recoverable recoverable) {
                    System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SS").format(new Date()) + " 开始尝试重连！");
                }
            });
            // 5、从链接中创建通道
            channel = connection.createChannel();
            /**
             * 6、声明（创建）队列
             * 如果队列不存在，才会创建
             * RabbitMQ 不允许声明两个队列名相同，属性不同的队列，否则会报错
             *
             * queueDeclare参数说明：
             * @param queue 队列名称
             * @param durable 队列是否持久化
             * @param exclusive 是否排他，即是否为私有的，如果为true,会对当前队列加锁，其它通道不能访问，并且在连接关闭时会自动删除，不受持久化和自动删除的属性控制
             * @param autoDelete 是否自动删除，当最后一个消费者断开连接之后是否自动删除
             * @param arguments 队列参数，设置队列的有效期、消息最大长度、队列中所有消息的生命周期等等
             */
            channel.queueDeclare("queue1", true, false, false, null);

            for (int i = 0; i < 100; i++) {
                // 消息内容
                String message = "Hello World " + i;
                try {
                    // 7、发送消息
                    channel.basicPublish("", "queue1", null, message.getBytes());
                } catch (AlreadyClosedException e) {
                    // 可能连接已关闭，等待重连
                    System.out.println("消息 " + message + " 发送失败！");
                    i--;
                    TimeUnit.SECONDS.sleep(2);
                    continue;
                }
                System.out.println("消息 " + i + " 已发送！");
                TimeUnit.SECONDS.sleep(2);
            }
        } catch (TimeoutException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        } finally {
            // 8、关闭通道
            if (channel != null && channel.isOpen()) {
                try {
                    channel.close();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (TimeoutException e) {
                    e.printStackTrace();
                }
            }

            // 9、关闭连接
            if (connection != null && connection.isOpen()) {
                try {
                    connection.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
