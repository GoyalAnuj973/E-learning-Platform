package com.hashedin.hu22.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name= "udemy_courses")
public class UdemyCourses implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String domain;

    private String description;

    private String author;

    private Double price;

    private int duration;

    private String reviews;

    private Double rating;

    @Transient
    @OneToMany(mappedBy = "udemyCourses",fetch = FetchType.EAGER)
    private Set<CartCourses> cartCourses;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "udemyCourses",fetch = FetchType.EAGER)
    private Set<UserCourses> userCoursesSet;

    public UdemyCourses() {

    }
}
