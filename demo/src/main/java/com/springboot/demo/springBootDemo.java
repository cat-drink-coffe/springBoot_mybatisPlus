package com.springboot.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/h")
public class springBootDemo {

    @GetMapping("/hello")
    public String getValue() {

        return "你是不是傻";
    }
}
