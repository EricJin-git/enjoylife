package com.jk.enjoylife.Service.Impl;

import com.jk.enjoylife.Dao.UserMapper;
import com.jk.enjoylife.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl  {
    @Autowired
    private UserMapper userMapper;

    public List<User> getall() {
        return userMapper.selectall();
    }


    public void insert1() {
        User user=new User();
        user.setName("lisui");
        userMapper.insert(user);

    }
}
