package com.bat.wz.cache.redis.a1_replaction;

import com.bat.wz.SpringbootApplication;
import com.bat.wz.cache.redis.a1_replaction.ReplicationExampleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringbootApplication.class})
@ActiveProfiles("replication-rw") // 激活主从集群-读写分离的配置
public class ReplicationRWTests {
    @Autowired
    ReplicationExampleService replicationExampleService;

    @Test
    public void setTest() {
        replicationExampleService.setByCache("tony", "xxxx");
        String result = replicationExampleService.getByCache("tony");
        System.out.println("从缓存中读取到数据：" + result);
    }
}
