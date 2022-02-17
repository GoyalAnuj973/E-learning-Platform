package com.hashedin.hu22.controllers;

import com.hashedin.hu22.entities.UserCourses;
import com.hashedin.hu22.service.CourseService;
import com.hashedin.hu22.service.UserCoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserCoursesController {
    @Autowired
    private UserCoursesService userCoursesService;

    @PostMapping(value = "userCourses/add")
    public UserCourses addUser(@RequestBody UserCourses userCourses){
        return userCoursesService.addUser(userCourses);
    }
}
