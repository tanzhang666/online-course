package com.learn.system.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SystemController {

    @RequestMapping("/test")
    public String test(){
        return "test";
    }

}
