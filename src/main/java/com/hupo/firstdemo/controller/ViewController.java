package com.hupo.firstdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/view")
public class ViewController {
    @RequestMapping(value = "/hello")
    public String hello(){
        return "hello";
    }

}
