package com.rupcharcha.springcontrol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {

    @GetMapping("/")
    public String test() {
        return "test";
    }

    String a = "this is alamin";

    @ResponseBody
    @GetMapping("/hello")
    public String hello() {
        return "hello " + a;
    }
}
