package com.example.projektdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RequestController {
    @GetMapping("/")
    public String index(){
        return "Home";
    }
}
