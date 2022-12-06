package com.example.courseapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @GetMapping
    public String Homepage(){
        return "Welcome to my website";
    }
}
