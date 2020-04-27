package com.bat.wz.cache.redis.a5_cluster;

import com.bat.wz.SpringbootApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

/**
 * @Classname ClusterServiceTests
 * @Description TODO
 * @Date 2020/4/26 16:20
 * @Created by wz
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootApplication.class)
@ActiveProfiles("cluster")
//集群对于客户端来说基本上是无感知的
public class ClusterServiceTests {
    @Autowired
    public ClusterService clusterService;

    @Test
    public void setTest() {
        clusterService.set("tony", "hahhhhh");
        clusterService.set("a", "1");
        clusterService.set("foo", "bar");
    }
    // 测试cluster集群故障时的反应
    @Test
    public void failoverTest() {
        while (true) {
            try {
                long i = System.currentTimeMillis();
                clusterService.set("tony", i + "");
                // delay 10ms
                TimeUnit.MILLISECONDS.sleep(10);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
