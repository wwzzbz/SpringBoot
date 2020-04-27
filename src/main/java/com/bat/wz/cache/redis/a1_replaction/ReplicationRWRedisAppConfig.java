package com.bat.wz.cache.redis.a1_replaction;

import io.lettuce.core.ReadFrom;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceClientConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;

/**
 * @Classname ReplicationRWRedisAppConfig
 * @Description TODO
 * @Date 2020/4/26 12:15
 * @Created by wz
 */
@Configuration
@Profile("replication-rw")
public class ReplicationRWRedisAppConfig {
    @Bean
    public LettuceConnectionFactory redisConnectionFactory() {
        System.out.println("使用读写分离版本");
        LettuceClientConfiguration clientConfig = LettuceClientConfiguration.builder()
                .readFrom(ReadFrom.SLAVE_PREFERRED)
                .build();
        // 此处
        RedisStandaloneConfiguration serverConfig = new RedisStandaloneConfiguration("192.168.8.100", 6379);
        return new LettuceConnectionFactory(serverConfig, clientConfig);
    }
}
