package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.config.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

/**
 * @description Redis cache测试Controller
 * @date in 11:45 2020/1/17
 * @author a small asshole
 * @version 1.0
 * @since 1.0
 */
@RestController
public class RedisCacheController {
    @Autowired
    private UserService userService;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @PostMapping("/add")
    public boolean addUser(){
        User user = new User();
        user.setName("卫云鹏");
        boolean addSuccessOrNot = userService.addUser(user);
//        if (addSuccessOrNot){
//            String userJosnStr = JSONObject.toJSONString(user);
//            stringRedisTemplate.opsForValue().set("system-user",userJosnStr);
//        }
        return addSuccessOrNot;
    }

    @GetMapping("/get")
    @Cacheable(value = "commodity",key = "#id")
    public User getUser(Integer id){
        return userService.getUser(id);
    }
    @PutMapping("/update")
    @CacheEvict(value = "commodity",key = "#user.userId")
    public boolean updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

}
