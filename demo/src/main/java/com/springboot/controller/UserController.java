package com.springboot.controller;

import com.springboot.entity.User;
import com.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName : UserController
 * @Description :
 * @Author : Ydz
 * @Date: 2021-01-22 16:07
 */
@RestController
public class UserController {
    @Autowired
    UserMapper userMapper;
    @GetMapping("/users")
    public List<User> getAll(){
        return userMapper.selectList(null);
    }
}
