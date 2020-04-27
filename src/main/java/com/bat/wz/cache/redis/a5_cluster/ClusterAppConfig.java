package com.bat.wz.cache.redis.a5_cluster;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.redis.connection.RedisClusterConfiguration;
import org.springframework.data.redis.connection.jedis.JedisClusterConnection;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

import java.util.Arrays;

/**
 * @Classname ClusterAppConfig
 * @Description TODO
 * @Date 2020/4/26 16:14
 * @Created by wz
 */
@Configuration
@Profile("cluster")
public class ClusterAppConfig {
    @Bean
    public JedisConnectionFactory redisConnection(){
        RedisClusterConfiguration clusterConfiguration = new RedisClusterConfiguration(Arrays.asList(
                "192.168.8.100:6381",
                "192.168.8.100:6382",
                "192.168.8.100:6383",
                "192.168.8.100:6384",
                "192.168.8.100:6385",
                "192.168.8.100:6386"));
        return new JedisConnectionFactory(clusterConfiguration);
    }
}
