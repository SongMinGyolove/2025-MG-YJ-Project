package com.mybatisinterceptorstudy.user.service;

import com.mybatisinterceptorstudy.user.vo.User;

import java.util.List;

public interface UserService {
    List<User> selectUserList(User user);
}
