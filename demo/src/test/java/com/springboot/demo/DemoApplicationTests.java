package com.springboot.demo;

import com.springboot.entity.User;
import com.springboot.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        // 参数是一个 Wrapper ，条件构造器，这里我们先设置条件为空，查询所有。
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
        Map map = new HashMap<>();
        map.forEach((x, y) -> {
                    System.out.println("x=" + x + y);
                }


        );
    }

    @Test
    public void insertIntoUser() {
        int result = userMapper.insert(new User("黄飞鸿", 18, "1234567878@126.com"));
        System.out.println(result);
    }

}
