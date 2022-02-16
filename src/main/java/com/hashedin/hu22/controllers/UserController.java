package com.hashedin.hu22.controllers;

import com.hashedin.hu22.entities.User;
import com.hashedin.hu22.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "user/addUser")
    public String addUser(@RequestBody User user){
        User user1 = userService.addUser(user);
        if(user1==null){
            return "Unable to add user";
        }
        return "User has been added";
    }


}
