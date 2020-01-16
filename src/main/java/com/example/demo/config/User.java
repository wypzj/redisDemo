package com.example.demo.config;


import lombok.*;

import java.io.Serializable;

/**
 * @author a small asshole
 * @version 1.0
 * @description redis序列化实体类
 * @date in 14:46 2020/1/16
 * @since 1.0
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User implements Serializable {
    private Integer userId;
    private String name;
}
