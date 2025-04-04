package com.mybatisinterceptorstudy.user.impl;

import com.mybatisinterceptorstudy.user.dao.UserDAO;
import com.mybatisinterceptorstudy.user.service.UserService;
import com.mybatisinterceptorstudy.user.vo.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public List<User> selectUserList(User user){
        return userDAO.selectUserList(user);
    }

    @Override
    public int insertUser(User user) {
        return userDAO.insertUser(user);
    }
}
