package com.example.gitfirstdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitController {

    @GetMapping("/name")
    public String getname(){

        return "Hi Ram";
    }
}
