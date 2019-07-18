package com.cfne.order.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cfne.api.OrderService;
import com.cfne.api.UserService;
import com.cfne.api.entity.User;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Reference //用于引入远程服务
    private UserService userService;

    @Override
    public User init() {
       return userService.getUser();
    }
}
