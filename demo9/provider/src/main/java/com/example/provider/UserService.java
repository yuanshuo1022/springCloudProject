package com.example.provider;


import com.example.feignapi.entity.User;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class UserService{

    private static List<User> users=new ArrayList<>();
    static{
        users.add(new User(1000,"tom",22));
        users.add(new User(1001,"lisa",23));
        users.add(new User(1002,"bobo",24));
    }
    public User findById( int id){
        //users.stream().filter()
        return users.get(id);
    }


    public List<User>getall(){
        return users;
    }

}
