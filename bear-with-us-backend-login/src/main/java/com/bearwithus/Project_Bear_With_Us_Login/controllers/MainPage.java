package com.bearwithus.Project_Bear_With_Us_Login.controllers;


import com.bearwithus.Project_Bear_With_Us_Login.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainPage {

    @Autowired
    private userRepository userRepo;
    @RequestMapping("/")
    public String signUpController() {
        return "Bear With Us Login Application";
    }

}
