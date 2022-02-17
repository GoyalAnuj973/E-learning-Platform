package com.hashedin.hu22.controllers;

import com.hashedin.hu22.entities.UdemyCourses;
import com.hashedin.hu22.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping(value = "udemyCourses/addCourses")
    public String addCourses(@RequestBody UdemyCourses udemyCourses){
        UdemyCourses udemyCourses1 = courseService.addCourses(udemyCourses);
        return "Course added";
    }

    @DeleteMapping(value = "udemyCourses/deleteCourses/{name}")
    public String deleteCourses(@PathVariable String name){
        String name1 = courseService.deleteCourses(name);
        return name1;
    }
}
