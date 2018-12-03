package com.lee.controller;

import com.lee.domain.User;
import com.lee.service.UserCURD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("client")
public class ClientController {

    @Autowired
    private UserCURD userCURD;

    @GetMapping("query/{id}")
    public User queryUser(@PathVariable Long id){
        return userCURD.queryUserById(id);
    }
}
