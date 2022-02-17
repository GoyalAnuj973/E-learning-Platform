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
@Table(name= "cart_courses")
public class CartCourses implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "udemy_courses_id")
    private UdemyCourses udemyCourses;

    @ManyToOne
    @JoinColumn(name = "user_cart_id")
    private UserCart userCart;

    

    public CartCourses(){

    }
}
