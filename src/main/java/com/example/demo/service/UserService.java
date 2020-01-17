package com.example.demo.service;

import com.example.demo.config.User;

/**
 * @author a small asshole
 * @version 1.0
 * @description Userservice层服务类
 * @date in 11:48 2020/1/17
 * @since 1.0
 */
public interface UserService {

    /**
     * 添加用户
     * @param user
     * @return
     */
    public boolean addUser(User user);

    /**
     * 获取用户
     * @param id
     * @return
     */
    public User getUser(Integer id);

    /**
     * 更新
     * @param user
     * @return
     */
    public boolean updateUser(User user);
}
