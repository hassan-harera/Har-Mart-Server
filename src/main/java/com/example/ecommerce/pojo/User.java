package com.example.ecommerce.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "user")
public class User {
    @Id
    @Column(name = "uid")
    Integer uid;
    String username;
    @Column(name = "phone_number")
    String phoneNumber;
    @Column(name = "lat")
    Long locationLat;
    @Column(name = "long")
    Long locationLong;
    @Column(name = "first_name")
    Long firstName;
    @Column(name = "last_name")
    Long lastName;
    @Column(name = "image_url")
    Long userImageUrl;
}
