package com.example.socialmedia.User;

import com.example.socialmedia.Posts.Post;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
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
    @JsonIgnore
    private String password;
    @OneToMany
    ArrayList<Post> post;
}
