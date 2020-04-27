package com.bat.wz.cache.redis.a4_sentinel;

import com.bat.wz.SpringbootApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Classname SentinelTests
 * @Description TODO
 * @Date 2020/4/26 15:21
 * @Created by wz
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootApplication.class)
@ActiveProfiles("sentinel")
public class SentinelTests {
    @Autowired
    RedisTemplate redisTemplate;
    @Test
    public void test() throws InterruptedException {
        int i = 0;
        while (true){
            i++;
            redisTemplate.opsForValue().set("test-value",String.valueOf(i));
            System.out.println("修改test-value值为："+i);
            Thread.sleep(1000L);
        }
    }
}
