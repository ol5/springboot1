package com.my.springboot1;

import com.alibaba.fastjson.JSON;
import com.my.springboot1.entity.User;
import com.my.springboot1.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springboot1ApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Test
    void contextLoads() {
        User user = new User();
//        user.setName("王元法");
//        user.setPassword("123456");
//        userMapper.insert(user);
        List<User> query = userMapper.query();
        System.out.println("全部用户 ： " + JSON.toJSONString(query) );
        user.setId(1);
        List<User> user1 = userMapper.query();
        System.out.println("id为1的用户 ： " + JSON.toJSONString(user1.get(0)) );
    }

}
