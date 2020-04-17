package com.my.springboot1.service;

import com.my.springboot1.entity.User;

import java.util.List;

public interface UserService {
    Boolean register(User user);
    List<User> query();
    User login(User user);
    User isRepeat(User user);
}
