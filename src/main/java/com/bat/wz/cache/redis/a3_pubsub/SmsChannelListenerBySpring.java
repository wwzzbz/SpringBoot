package com.bat.wz.cache.redis.a3_pubsub;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Classname SmsChannelListenerBySpring
 * @Description TODO
 * @Date 2020/4/26 15:04
 * @Created by wz
 */
@Component
@Profile("pub_sub")
@Configuration
public class SmsChannelListenerBySpring {
    @Bean
    public RedisMessageListenerContainer redisMessageListener(RedisConnectionFactory redisConnectionFactory){
        RedisMessageListenerContainer messageListener = new RedisMessageListenerContainer();
        messageListener.setConnectionFactory(redisConnectionFactory);
        SmsSendListener smsSendListener = new SmsSendListener();
        messageListener.addMessageListener(smsSendListener, Arrays.asList(new ChannelTopic(PubsubRedisAppConfig.TEST_CHANNEL_NAME)));
        return messageListener;
    }

    private class SmsSendListener implements MessageListener {
        @Override
        public void onMessage(Message message, byte[] bytes) {
            System.out.println("借助spirng容器收到消息："+ message);
        }
    }
}
