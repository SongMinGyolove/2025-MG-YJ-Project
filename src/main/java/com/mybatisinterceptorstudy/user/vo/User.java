package com.mybatisinterceptorstudy.user.vo;

import lombok.Data;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.util.ObjectUtils;

@Data
public class User {
    private String userId;
    private String userPw;

    public boolean isValidate(){
        return !ObjectUtils.isEmpty(this.userId) && !ObjectUtils.isEmpty(this.userPw);
    }
}
