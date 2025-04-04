package com.mybatisinterceptorstudy.user.dao;

import com.mybatisinterceptorstudy.user.vo.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAO {

    private final SqlSession sqlSession;

    public UserDAO(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
        /*12321*/
    }

    public List<User> selectUserList(User user) {
        return sqlSession.selectList("selectUserList", user);
    }

    public int insertUser(User user) {
        return sqlSession.insert("insertUser", user);
    }
}
