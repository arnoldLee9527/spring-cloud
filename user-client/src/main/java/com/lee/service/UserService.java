package com.lee.service;

import com.lee.dao.UserFeignClient;
import com.lee.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserFeignClient userFeignClient;

    public List<User> queryUserById(List<Long> ids) {
        List<User> users = new ArrayList<>();
        ids.forEach(id -> users.add(userFeignClient.queryUserById(id)));
        return users;
    }
}
