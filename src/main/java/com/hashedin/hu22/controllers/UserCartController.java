package com.hashedin.hu22.controllers;

import com.hashedin.hu22.entities.UserCart;
import com.hashedin.hu22.service.UserCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserCartController {

    @Autowired
    private UserCartService userCartService;

    @PostMapping(value = "userCart/addCourses")
    public String addCourses(@RequestBody UserCart userCart){
        UserCart userCart1 = userCartService.addCourses(userCart);
        return "Course added in the cart";
    }

    @DeleteMapping(value = "userCart/deleteCourses/{courseName}")
    public String deleteCourses(@PathVariable String courseName){
        String courseName1 = userCartService.deleteCourses(courseName);
        return courseName;
    }
}
