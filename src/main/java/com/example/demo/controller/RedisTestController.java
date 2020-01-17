package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.config.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author a small asshole
 * @version 1.0
 * @description redis测试类
 * @date in 18:56 2020/1/16
 * @since 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTestController {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    /**
     *正常使用
     */
    @Test
    public void setValueToRedis(){
        User user = new User();
        user.setUserId(123);
        user.setName("卫云鹏");

        String userJosnStr = JSONObject.toJSONString(user);
        stringRedisTemplate.opsForValue().set("system-user",userJosnStr);
    }

    @Test
    public void getValue(){
        System.out.println(stringRedisTemplate.opsForValue().get("system-user"));
    }

    /**
     * redis作为springccache使用
     */
    //TODO

}
