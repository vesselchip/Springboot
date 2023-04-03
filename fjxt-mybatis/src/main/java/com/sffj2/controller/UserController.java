package com.sffj2.controller;

import com.sffj2.entity.User;
import com.sffj2.result.RestMessage;
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
    @GetMapping("/")
    public String hello(){
        return "hello";
    }
    @GetMapping("/getAllUser")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }
    @PostMapping("/addUser")
    public RestMessage addUser(@RequestBody User user){
        return new RestMessage();
    }
}
