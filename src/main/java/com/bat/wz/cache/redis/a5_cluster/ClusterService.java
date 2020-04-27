package com.bat.wz.cache.redis.a5_cluster;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @Classname ClusterService
 * @Description TODO
 * @Date 2020/4/26 16:19
 * @Created by wz
 */

@Service
@Profile("cluster")
public class ClusterService {
    @Autowired
    private StringRedisTemplate template;

    public void set(String userId, String userInfo) {
        template.opsForValue().set(userId, userInfo);
    }
}
