package com.mybatisinterceptorstudy.user.controller;

import com.mybatisinterceptorstudy.user.service.UserService;
import com.mybatisinterceptorstudy.user.vo.User;
import com.mybatisinterceptorstudy.util.ResultDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("user")
public class UserController {

    private final UserService userService;

    @PostMapping("post")
    public List<User> selectUser(@RequestBody User user){
        return userService.selectUserList(user);
    }

    @PostMapping("add")
    public ResponseEntity<ResultDTO<Integer>> insertUser(@RequestBody User user){
        return ResponseEntity.ok(ResultDTO.ok(userService.insertUser(user)));
    }
}
