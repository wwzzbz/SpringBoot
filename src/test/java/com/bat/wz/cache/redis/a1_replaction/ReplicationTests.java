package com.bat.wz.cache.redis.a1_replaction;

import com.bat.wz.SpringbootApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringbootApplication.class})
@ActiveProfiles("replication") // 激活主从复制的配置
public class ReplicationTests {
    @Autowired
    ReplicationExampleService replicationExampleService;

    @Test
    public void setTest() {
        replicationExampleService.setByCache("tony", "hahhhhh");
    }
}
