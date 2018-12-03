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
    public User findUserById(Long id) {
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }
}
