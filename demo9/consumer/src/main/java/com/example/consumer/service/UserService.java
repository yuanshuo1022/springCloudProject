package com.example.consumer.service;

import com.example.feignapi.entity.Result;
import com.example.feignapi.entity.User;
import com.example.feignapi.entity.service.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService{
    @Autowired
    private UserClient userClient;

    public Result getall(){
        Result queryall = userClient.queryall();
        if(queryall==null){
            return Result.queryFail("数据为空");
        }
        return Result.ok(queryall);
    }
    public Result findById(int id){
        Result byId = userClient.findById(id);
        if(byId==null){
            return Result.queryFail("没有该用户");
        }
        return  Result.ok(byId);
    }

    public Result getport(){
        Result port = userClient.port();
        if(port==null){
         return Result.queryFail("端口查询失败");
        }

        return Result.ok(port);
    }
}
