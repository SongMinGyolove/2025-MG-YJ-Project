package com.mybatisinterceptorstudy.user.controller;

import com.mybatisinterceptorstudy.user.service.UserService;
import com.mybatisinterceptorstudy.user.vo.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("post")
    public List<User> selectUser(@RequestBody User user){
        return userService.selectUserList(user);
    }
}
