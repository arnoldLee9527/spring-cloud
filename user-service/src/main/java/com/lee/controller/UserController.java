package com.lee.controller;

import com.lee.domain.User;
import com.lee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("findUser/{id}")
    @CrossOrigin
    public User findUserById(@PathVariable Long id){
        //User user = userService.findUserById(id);
        User user = new User();
        user.setUserName("123");
        return user;
    }

}
