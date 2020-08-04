package com.whisper.shop.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
    管理员
    private int id;            主键id
    private String name;       用户名
    private String password;   密码
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Manager {
    private int id;
    private String name;
    private String password;
}
