package com.lee.dao;

import com.lee.config.FeignConfig;
import com.lee.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "user-service", fallback = UserFeignClientFallback.class, configuration = FeignConfig.class)
public interface UserFeignClient {

    @GetMapping("/user/findUser/{id}")
    User queryUserById(@PathVariable("id") Long id);
}