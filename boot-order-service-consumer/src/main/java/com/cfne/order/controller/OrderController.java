package com.cfne.order.controller;

import com.cfne.api.OrderService;
import com.cfne.api.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/user")
    public User initOrder(){

        return orderService.init();
    }

}