package com.hashedin.hu22.service;

import com.hashedin.hu22.entities.UdemyCourses;
import com.hashedin.hu22.entities.UserCourses;
import com.hashedin.hu22.repositories.CourseRepository;
import com.hashedin.hu22.repositories.UserCoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserCoursesService {

    @Autowired
    private UserCoursesRepository userCoursesRepository;

    public UserCourses addUser(UserCourses userCourses){
        userCoursesRepository.save(userCourses);
        return userCourses;
    }
}
