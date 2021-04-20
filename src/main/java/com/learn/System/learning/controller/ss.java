package com.learn.System.learning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ss {
    @RequestMapping("/ssw")
    @ResponseBody
    String ssw(){
        return "1";
    }
}
