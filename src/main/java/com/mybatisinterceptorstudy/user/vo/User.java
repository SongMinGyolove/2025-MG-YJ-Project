package com.mybatisinterceptorstudy.user.vo;

import lombok.Data;
import org.apache.ibatis.annotations.Mapper;

@Data
public class User {
    private String userId;
    private String userPw;
}
