package com.example.socialmedia.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Entity
@Getter @Setter
public class User {
    @Id private String username;
    @Column(unique = true, nullable = false)
    private String email;
    private String bio;
    private String password;
    //private ArrayList<Post> posts;
}
