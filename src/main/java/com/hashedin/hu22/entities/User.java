package com.hashedin.hu22.entities;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name= "user")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private String bio;

    private String areasOfInterest;

    private String userType;

    private int experience;

    private String domain;

    private String role;

    private String profilePicture;

    @Transient
    @OneToOne(mappedBy = "user",fetch = FetchType.EAGER)
    private Wishlist userWishlist;

//    @Transient
//    @OneToMany(mappedBy = "userList",fetch = FetchType.EAGER)
//    private Order order;


    @OneToMany(cascade = CascadeType.ALL,mappedBy = "user",fetch = FetchType.EAGER)
    private Set<UserCourses> userCoursesSet;

    @Transient
    @OneToOne(mappedBy = "user",fetch = FetchType.EAGER)
    private UserCart userCart;


    public User(){

    }
}
