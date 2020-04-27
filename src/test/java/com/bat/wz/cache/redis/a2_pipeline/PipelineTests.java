package com.bat.wz.cache.redis.a2_pipeline;

import com.bat.wz.SpringbootApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Classname PipelineTests
 * @Description TODO
 * @Date 2020/4/26 14:31
 * @Created by wz
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootApplication.class)
@ActiveProfiles("pipeline")
public class PipelineTests {
    @Autowired
    RedisTemplate redisTemplate;

    @Test
    public void test1() {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            redisTemplate.opsForList().leftPush("queue_1",i);
        }
        System.out.println("操作完毕:"+redisTemplate.opsForList().size("queue_1"));
        System.out.println("普通模式一万次操作耗时："+((System.currentTimeMillis())-time)/1000);
        time = System.currentTimeMillis();
        redisTemplate.executePipelined(new RedisCallback<Object>() {

            @Override
            public Object doInRedis(RedisConnection redisConnection) throws DataAccessException {
                for (int i = 0; i < 10000; i++) {
                    redisConnection.lPush("queue_2".getBytes(),String.valueOf(i).getBytes());
                }
                return null;
            }
        });
        System.out.println("操作完毕:"+redisTemplate.opsForList().size("queue_2"));
        System.out.println("普通模式一万次操作耗时："+((System.currentTimeMillis())-time)/1000);
    }
}
