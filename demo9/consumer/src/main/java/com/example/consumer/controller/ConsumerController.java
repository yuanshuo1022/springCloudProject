package com.example.consumer.controller;


import com.example.consumer.service.UserService;
import com.example.feignapi.entity.Result;
import com.example.feignapi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


import javax.ws.rs.Path;
import java.util.List;


@RestController
@RequestMapping("/test")
public class ConsumerController {
    @Autowired
    private UserService userService;
    @GetMapping("/port")
    public Result getport(){
        Result getports = userService.getport();
        if(getports==null){
            Result.queryFail("端口查询");
        }
        return Result.ok(getports);
    }

    @GetMapping("/all")
    public Result queryall(){
        return  userService.getall();
    }
      @GetMapping("/findById/{id}")
    public Result findById(@PathVariable("id") int id){
        return  userService.findById(id);
      }

}
