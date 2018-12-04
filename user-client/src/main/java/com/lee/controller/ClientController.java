package com.lee.controller;

import com.lee.domain.User;
import com.lee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("client")
public class ClientController {

    @Autowired
    private UserService userService;

    @GetMapping("query")
    public List<User> queryUser(@RequestParam List<Long> ids){
        return userService.queryUserById(ids);
    }
}
