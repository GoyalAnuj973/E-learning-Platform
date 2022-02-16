package com.hashedin.hu22.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

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

    private double rating;

    public UdemyCourses() {

    }
}
