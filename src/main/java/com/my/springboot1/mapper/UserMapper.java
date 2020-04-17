package com.my.springboot1.mapper;

import com.my.springboot1.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper {
    int insert(User user);
    List<User> query();
    User isValid(User user);
    User isRepeat(User user);
}
