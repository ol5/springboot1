package com.my.springboot1.service.impl;

import com.my.springboot1.entity.User;
import com.my.springboot1.mapper.UserMapper;
import com.my.springboot1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public Boolean register(User user) {
        return userMapper.insert(user)==1;
    }


    @Override
    public List<User> query() {
        return userMapper.query();
    }

    @Override
    public User login(User user) {
        return userMapper.isValid(user);
    }
}
