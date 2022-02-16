package com.hashedin.hu22.service;

import com.hashedin.hu22.entities.User;
import com.hashedin.hu22.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User addUser(User user) {
        userRepository.save(user);
        List<User> user1 = userRepository.findAll();
        boolean flag=false;
        for (User u:user1){
            if (u.getFirstName().equalsIgnoreCase(user.getFirstName()) && u.getLastName().equalsIgnoreCase(user.getLastName())){
                flag=true;
            }
        }
        if (flag==false){
            return null;
        }
        return user;
    }

}
