package com.example.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class usercontroller {
    @RestController
    public class UserController {
        @Value("${data.env}")
        String data;
        @RequestMapping(value = "/test/show")
        public String hi(){
            return data;
        }

    }

}
