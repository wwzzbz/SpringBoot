package com.bat.wz.cache.redis.a1_replaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @Classname ReplicationExampleService
 * @Description TODO
 * @Date 2020/4/26 12:17
 * @Created by wz
 */
@Service
public class ReplicationExampleService {
    @Autowired
    private StringRedisTemplate template;

    public void setByCache(String userId, String userInfo) {
        template.opsForValue().set(userId, userInfo);
    }

    public String getByCache(String userId) {
        return template.opsForValue().get(userId);
    }
}
