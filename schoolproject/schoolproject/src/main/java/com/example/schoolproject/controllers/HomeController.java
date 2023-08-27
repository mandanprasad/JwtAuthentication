package com.example.schoolproject.controllers;

import com.example.schoolproject.models.User;
import com.example.schoolproject.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {


    @Autowired
    private UserService userService;
    @GetMapping("/user")
    public List<User> getUser() {
        System.out.println("getting multiple users");
        return userService.getUser();
    }

    @GetMapping("/current")
    public String getLoggedInUser(Principal principal) {
        return principal.getName();
    }



}
