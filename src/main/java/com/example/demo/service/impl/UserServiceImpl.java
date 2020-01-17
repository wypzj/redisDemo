package com.example.demo.service.impl;

import com.example.demo.mapper.UserMapper;
import com.example.demo.config.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author a small asshole
 * @version 1.0
 * @description TODO
 * @date in 11:58 2020/1/17
 * @since TODO
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean addUser(User user) {
        return userMapper.insert(user) > 0;
    }

    @Override
    public User getUser(Integer id) {
        return userMapper.selectById(id);
    }

    @Override
    public boolean updateUser(User user) {
        return userMapper.updateById(user) > 0;
    }
}
