package com.benchu.wiki.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }


    @PostMapping("/name")
    public String hello(String name) {
        return "hello world " + name;
    }
}
