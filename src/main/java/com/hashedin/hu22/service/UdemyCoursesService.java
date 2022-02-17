package com.hashedin.hu22.service;

import com.hashedin.hu22.entities.UdemyCourses;
import com.hashedin.hu22.entities.UserCart;
import com.hashedin.hu22.object.ReviewRatingReq;
import com.hashedin.hu22.repositories.CourseRepository;
import com.hashedin.hu22.repositories.UdemyCoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UdemyCoursesService {
    @Autowired
    private UdemyCoursesRepository udemyCoursesRepository;

    public UdemyCourses addReviewRating(ReviewRatingReq reviewRatingReq){
        List<UdemyCourses> udemyCoursesList = udemyCoursesRepository.findAll();
        UdemyCourses udemyCourses=null;
        for(UdemyCourses u: udemyCoursesList){
            if(u.getName().equalsIgnoreCase(reviewRatingReq.getName())){
                udemyCourses=u;
                break;
            }
        }

        if(udemyCourses==null){
            return null;
        }

        udemyCourses.setReviews(reviewRatingReq.getReview());
        udemyCourses.setRating(reviewRatingReq.getRating());
        udemyCoursesRepository.save(udemyCourses);
        return udemyCourses;
    }

    public UdemyCourses details(String name){
        List<UdemyCourses> udemyCoursesList = udemyCoursesRepository.findAll();
        UdemyCourses udemyCourses1=null;
        for(UdemyCourses u: udemyCoursesList){
            if(u.getName().equalsIgnoreCase(name)){
                udemyCourses1=u;
                break;
            }
        }
        return udemyCourses1;
    }
}
