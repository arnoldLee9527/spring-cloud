package com.lee.service;

import com.lee.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    User findUserById(@Param("userName") String userName);
}
