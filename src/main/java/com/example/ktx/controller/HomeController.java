package com.example.ktx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping(value = "/")
    private String home(){
        return "home";
    }
    @GetMapping(value = "/login")
    private String login(){
        return "login";
    }
}
