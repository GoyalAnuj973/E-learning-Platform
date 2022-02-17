package com.hashedin.hu22.service;

import com.hashedin.hu22.entities.UdemyCourses;
import com.hashedin.hu22.entities.User;
import com.hashedin.hu22.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public UdemyCourses addCourses(UdemyCourses udemyCourses){
        courseRepository.save(udemyCourses);
        List<UdemyCourses> udemyCourses1 = courseRepository.findAll();
        boolean flag=false;
        for (UdemyCourses u:udemyCourses1){
            if (u.getName().equalsIgnoreCase(udemyCourses.getName())){
                flag=true;
            }
        }
        if (flag==false){
            return null;
        }

        return udemyCourses;
    }

    public String deleteCourses(String name){
        List<UdemyCourses> udemyCourses1 = courseRepository.findAll();
        Long id=-1l;
        for (UdemyCourses u:udemyCourses1){
            if (u.getName().equalsIgnoreCase(name)){
                id = u.getId();
                break;
            }
        }
        if (id==-1){
            return "Course not found";
        }
        courseRepository.deleteById(id);
        return "Course successfully deleted";
    }
}
