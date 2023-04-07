package com.example.feignapi.entity.service;

import com.example.feignapi.entity.Result;
import com.example.feignapi.entity.User;
import com.example.feignapi.entity.config.LogConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="provider",configuration = LogConfiguration.class,fallback = UserClientImpl.class)
@Service
public interface UserClient{
    @GetMapping("/queryall")
    public Result queryall();
    @GetMapping("/queryall/{id}")
    public Result findById(@PathVariable("id")int id);

    @GetMapping("/port")
    public Result port();
}
