package com.bat.wz.cache.redis.a4_sentinel;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.redis.connection.RedisSentinelConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;

/**
 * @Classname a4_sentinel
 * @Description TODO
 * @Date 2020/4/26 15:16
 * @Created by wz
 */
@Configuration
@Profile("sentinel")
public class SentinelRedisAppConfig {
    public LettuceConnectionFactory redisConnectionFactory(){
        System.out.println("使用哨兵版本");
        RedisSentinelConfiguration sentinelConfiguration = new RedisSentinelConfiguration();
        sentinelConfiguration.master("mymaster")
                .sentinel("192.168.8.100",26380)
                .sentinel("192.168.8.100",26381)
                .sentinel("192.168.8.100",26382);
        return new LettuceConnectionFactory(sentinelConfiguration);
    }
}
