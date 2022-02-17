package com.hashedin.hu22.service;

import com.hashedin.hu22.entities.UdemyCourses;
import com.hashedin.hu22.entities.User;
import com.hashedin.hu22.entities.UserCourses;
import com.hashedin.hu22.repositories.CourseRepository;
import com.hashedin.hu22.repositories.UdemyCoursesRepository;
import com.hashedin.hu22.repositories.UserCoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserCoursesService {

    @Autowired
    private UserCoursesRepository userCoursesRepository;

    @Autowired
    private UdemyCoursesRepository udemyCoursesRepository;

    public UserCourses addUser(UserCourses userCourses){
        userCoursesRepository.save(userCourses);
        return userCourses;
    }


    public List<UdemyCourses> getUserCourses(Long id){
        List<UserCourses> userCoursesList = userCoursesRepository.findAll();
        List<UdemyCourses> udemyCoursesList = udemyCoursesRepository.findAll();

        List<Long> idList = new ArrayList<>();

        List<UdemyCourses> udm = new ArrayList<>();

        for(UserCourses uc : userCoursesList){
            if(uc.getId() == id){
                idList.add((uc.getUdemyCourses()).getId());
            }
        }

        for(UdemyCourses uc : udemyCoursesList){
            for(Long idl : idList){
                if(uc.getId() == idl)
                    udm.add(uc);
            }
        }

        return udm;
    }
}
