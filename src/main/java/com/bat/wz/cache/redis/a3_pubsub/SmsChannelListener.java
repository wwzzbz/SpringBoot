package com.bat.wz.cache.redis.a3_pubsub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @Classname SmsChannelListener
 * @Description TODO
 * @Date 2020/4/26 15:01
 * @Created by wz
 */
@Component
@Profile("pub_sub")
public class SmsChannelListener {
    @Autowired
    RedisTemplate redisTemplate;
    @Bean
    public void setup(){
        redisTemplate.execute(new RedisCallback() {
            @Override
            public Object doInRedis(RedisConnection redisConnection) throws DataAccessException {
                redisConnection.subscribe((message, bytes) -> System.out.println("收到发布消息:"+message),PubsubRedisAppConfig.TEST_CHANNEL_NAME.getBytes());
                return null;
            }
        });
    }
}
