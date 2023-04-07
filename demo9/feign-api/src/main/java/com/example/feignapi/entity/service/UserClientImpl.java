package com.example.feignapi.entity.service;

import com.example.feignapi.entity.Result;
import com.example.feignapi.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class UserClientImpl  implements  UserClient{
    @Override
    public Result queryall() {

        return null;
    }

    @Override
    public Result findById(int id) {
        return null;
    }

    @Override
    public Result port() {
        return Result.Fail("提供者不可用");
    }
}
