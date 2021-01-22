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
    void selectAll() {
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
        User user = new User();
        int result = userMapper.insert(new User("李世民", 18, "12e34567878@126.com"));
        System.out.println(result);
    }

    @Test
    public void updateUser() {
        User user = new User();
        user.setId(3l);
        user.setAge(1);
        int result = userMapper.updateById(user);
        System.out.println(result);
    }
}
