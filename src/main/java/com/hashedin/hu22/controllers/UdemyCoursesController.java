package com.hashedin.hu22.controllers;

import com.hashedin.hu22.entities.UdemyCourses;
import com.hashedin.hu22.object.ReviewRatingReq;
import com.hashedin.hu22.service.UdemyCoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UdemyCoursesController {
    @Autowired
    private UdemyCoursesService udemyCoursesService;

    @PostMapping("/addReviewRating")
    public String addReviewRating(@RequestBody ReviewRatingReq reviewRatingReq){
        UdemyCourses udemyCourses = udemyCoursesService.addReviewRating(reviewRatingReq);
        if (udemyCourses==null){
            return "Udemy Course doesn't exist";
        }
        return "Review and rating got updated";
    }

    @GetMapping(value = "udemyCourses/getDetails/{name}")
    public UdemyCourses details(@PathVariable String name){
        UdemyCourses udemyCourses1 = udemyCoursesService.details(name);
        return udemyCourses1;
    }
}
