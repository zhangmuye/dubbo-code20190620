package com.cfne.user.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cfne.api.UserService;
import com.cfne.api.entity.User;
import org.springframework.stereotype.Component;

@Service
@Component
public class UserServiceImpl implements UserService {
    @Override
    public User getUser() {

        return new User(1, "陈伟");
    }
}
