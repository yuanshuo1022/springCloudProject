package com.example.provider.controller;

import com.example.feignapi.entity.User;
import com.example.provider.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProviderController{
    @Autowired
    private UserService userService;
    @Value("${server.port}")
    private String port;
    @GetMapping("/port")
    public String getport(){
        return "提供者提供服务的端口号："+port;
    }
    @GetMapping("/queryall")
    public List<User> queryall(){
        return  userService.getall();
    }
    @GetMapping("/queryall/{id}")
    public User findById(@PathVariable("id")int id){
        return  userService.findById(id);
    }
}
