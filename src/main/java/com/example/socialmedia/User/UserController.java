package com.example.socialmedia.User;

import com.example.socialmedia.User.authorize.LogIn;
import com.example.socialmedia.User.authorize.SignUp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
class UserController {
    @Autowired
    private LogIn logIn;

    @Autowired
    private SignUp signUp;

    @PostMapping("/login")
    public @ResponseBody ResponseEntity<User> login(
            @RequestParam String email,
            @RequestParam String password
    ) {
        return logIn.logIn(email, password);
    }

    @PostMapping("/signup")
    public @ResponseBody ResponseEntity<String> signup(
            @RequestParam String email,
            @RequestParam String password,
            @RequestParam String username
    ) {
        return signUp.createUser(email, password, username);
    }
}