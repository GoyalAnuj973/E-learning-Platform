package com.hashedin.hu22.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name= "user_cart")
public class UserCart implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.EAGER)
    private User user;

    //@OneToMany(cascade = CascadeType.ALL,mappedBy = "",fetch = FetchType.EAGER)
    private String courseName;

    public UserCart() {

    }
}
