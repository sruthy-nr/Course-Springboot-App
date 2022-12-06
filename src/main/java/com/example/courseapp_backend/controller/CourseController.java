package com.example.courseapp_backend.controller;

import com.example.courseapp_backend.model.Courses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @GetMapping("/")
    public String Homepage(){
        return "Welcome to my website";
    }
    @PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
    public String AddCourse(@RequestBody Courses c){
        System.out.println(c.getCourseTitle().toString());
        return "Course added successfully";
    }
}
