package com.sffj2.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sffj2.entity.User;
import com.sffj2.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Api(tags = "用户管理")
@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping("/getAllUser")
    public List<User> getAllUser(){
        QueryWrapper< User > wrapper = new QueryWrapper<>();
        wrapper.eq("isdeleted" , "0" );
        List<User> user =  userService.list(wrapper);
        return user;
    }
    @GetMapping("/insert")
    public void insert(){
        User user = new User();
        user.setId(3l);
        user.setUsername("张三");
        user.setPassword("123456");
        user.setRole(1);
        user.setIsdeleted(0);
//        userService.insert(user);
    }
}
