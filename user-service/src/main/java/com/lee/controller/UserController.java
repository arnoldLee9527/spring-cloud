package com.lee.controller;
import java.util.Date;

import com.lee.domain.User;
import com.lee.domain.baseDomain.ReturnDomain;
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

    @RequestMapping("findUser/{userName}")
    public ReturnDomain<User> findUserById(@PathVariable String userName){
        ReturnDomain<User> returnDomain = null;
        returnDomain = new ReturnDomain<>();
        try {
            User user = userService.findUserById(userName);
            returnDomain.setReturnCode(0);
            returnDomain.setReturnDomain(user);
        } catch (Exception e) {
            returnDomain.setReturnCode(-1);
            returnDomain.setReturnMsg("系统异常！");
        }
        return returnDomain;
    }

}
