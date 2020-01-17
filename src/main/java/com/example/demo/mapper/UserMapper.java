package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.config.User;
import org.springframework.stereotype.Component;

/**
 * @author a small asshole
 * @version 1.0
 * @description user类 sql语句mapper接口
 * @date in 11:56 2020/1/17
 * @since 1.0
 */
@Component
public interface UserMapper extends BaseMapper<User> {
}
