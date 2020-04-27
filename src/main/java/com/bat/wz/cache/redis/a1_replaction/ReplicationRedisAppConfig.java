package com.bat.wz.cache.redis.a1_replaction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;

/**
 * @Classname ReplicationRedisAppConfig
 * @Description TODO
 * @Date 2020/4/26 12:12
 * @Created by wz
 */
@Configuration
@Profile("replication")//主从模式
public class ReplicationRedisAppConfig {
    @Bean
    public LettuceConnectionFactory redisConnectionFactory(){
        return new LettuceConnectionFactory(new RedisStandaloneConfiguration("192.168.8.100",6380));
    }
}
