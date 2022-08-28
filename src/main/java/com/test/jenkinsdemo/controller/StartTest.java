package com.test.jenkinsdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartTest {

    @RequestMapping("/index")
    public String index(){
        return "hello SpringBoot";
    }
}
