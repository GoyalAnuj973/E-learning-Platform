package com.hashedin.hu22.service;

import com.hashedin.hu22.entities.UdemyCourses;
import com.hashedin.hu22.entities.User;
import com.hashedin.hu22.entities.UserCart;
import com.hashedin.hu22.entities.UserCourses;
import com.hashedin.hu22.repositories.UserCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserCartService {

    @Autowired
    private UserCartRepository userCartRepository;

    public UserCart addCourses(UserCart userCart){
        userCartRepository.save(userCart);
        List<UserCart> userCartList = userCartRepository.findAll();
        boolean flag=false;
        for(UserCart u: userCartList){
            if(u.getCourseName().equalsIgnoreCase(userCart.getCourseName())){
                flag=true;
            }
        }
        if(flag){
            return null;
        }
        return userCart;
    }

    public String deleteCourses(String courseName){
        List<UserCart> userCartList = userCartRepository.findAll();
        Long id=-1l;
        for (UserCart u:userCartList){
            if (u.getCourseName().equalsIgnoreCase(courseName)){
                id = u.getId();
                break;
            }
        }
        if (id==-1){
            return "Course not found in the cart";
        }
        userCartRepository.deleteById(id);
        return "Course successfully deleted from the cart";
    }

    public List<UserCart> getCartCourses(UserCart userCart){
        List<UserCart> userCartList = userCartRepository.findAll();
        boolean flag=false;
        for(UserCart u: userCartList){
            if(u.getId().equals(userCartList)){
                flag=true;
                break;
            }
        }
        if (flag==false){
            return null;
        }
        return userCartList;
    }
}
