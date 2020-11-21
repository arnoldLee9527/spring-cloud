package com.lee.service.impl;

import com.lee.domain.User;
import com.lee.mapper.UserMapper;
import com.lee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserById(String userName) {
        long time = (long) (Math.random() * 2000 + 1);
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        User user = userMapper.selectByPrimaryKey(userName);
        return user;
    }
}
