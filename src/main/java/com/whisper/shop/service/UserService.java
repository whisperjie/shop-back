package com.whisper.shop.service;

//import com.whisper.shop.dao.UserDao;

import com.whisper.shop.dao.UserDao;
import com.whisper.shop.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    //UserMapper userMapper;
    UserDao userDao;

    public List<User> getAllUser() {
        return userDao.findAll();
    }
}
