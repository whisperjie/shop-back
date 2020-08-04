package com.whisper.shop.controller;



import com.whisper.shop.entity.User;
import com.whisper.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/admin")
public class LoginController {
    @Autowired
    UserService userService;

    @RequestMapping("/getAllUser")
    public List<User> login(){
        //System.out.println(">>>>>>>go login");
        //if ()
        return userService.getAllUser();
    }
}
