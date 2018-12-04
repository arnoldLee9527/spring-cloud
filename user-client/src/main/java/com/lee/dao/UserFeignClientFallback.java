package com.lee.dao;

import com.lee.domain.User;
import org.springframework.stereotype.Component;

@Component
public class UserFeignClientFallback implements UserFeignClient {
    @Override
    public User queryUserById(Long id) {

        User user = new User();
        user.setId(id);
        user.setUserName("feign查询异常");
        return user;
    }
}
