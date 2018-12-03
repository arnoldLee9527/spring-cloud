package com.lee.service;

import com.lee.domain.User;
import com.netflix.appinfo.InstanceInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class UserCURD {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    public User queryUserById(Long id){
        //根据服务名称获取实例对象
        List<ServiceInstance> instances = discoveryClient.getInstances("user-service");
        ServiceInstance instance = instances.get(0);

        return restTemplate.getForObject("http://"+instance.getHost()+":"+instance.getPort()+"/user/findUser/"+id, User.class);
    }
}
