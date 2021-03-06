package com.my.springboot1.controller;

import com.alibaba.fastjson.JSON;
import com.my.springboot1.entity.User;
import com.my.springboot1.service.UserService;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.ast.NullLiteral;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/register")
    public String registerView() {
        return "register";
    }
    @PostMapping(value = "/register", produces = "application/json;charset=utf-8")
    @ResponseBody
    public Map<String, Object> AAList(User user) {
        System.out.println("前台传来user=" + user);
        Map<String, Object> map = new HashMap<>();
        User user1=userService.isRepeat(user);
        System.out.println("????"+user1);
        if(user1==null) {
//            System.out.println(user1.getName());
//        if(user1.getName().compareTo(user.getName())!=0)
            map.put("result", userService.register(user));
        }
        return map;
    }
    @PostMapping(value = "/query", produces = "application/json;charset=utf-8")
    @ResponseBody
    public String AllList(){
        List<User> list = userService.query();
        System.out.println("全部："+JSON.toJSONString(list));
        String s=JSON.toJSONString(list);
        System.out.println("s"+s);
        return JSON.toJSONString(s);
    }
    @PostMapping(value = "/login", produces = "application/json;charset=utf-8")
    @ResponseBody
    public  User oL(User user){
          return userService.login(user);
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }
    @GetMapping("/layuiRegister")
    public String layuiRegister() {
        return "layui-register";
    }
}
