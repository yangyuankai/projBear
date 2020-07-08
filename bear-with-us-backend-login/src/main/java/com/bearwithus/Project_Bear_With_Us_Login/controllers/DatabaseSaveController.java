package com.bearwithus.Project_Bear_With_Us_Login.controllers;

import com.bearwithus.Project_Bear_With_Us_Login.entities.User;
import com.bearwithus.Project_Bear_With_Us_Login.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.support.SimpleTriggerContext;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DatabaseSaveController {

    @Autowired
    userRepository userRepo;

    @CrossOrigin
    @PostMapping("/signUp")
    public String saveUserToMongo(@RequestBody User user) {
        List<User> currentUsers = userRepo.findAll();
        for (User usr: currentUsers) {
            if (usr.getEmail().equals(user.getEmail())) {
                return "User " + user.getName() + "already has an account!";
            }
        }
        User _user = userRepo.save(new User(user.getName(), user.getEmail(), user.getPhone()));
        return "User "  + _user.getName() + " successfully created!";
    }

    @CrossOrigin
    @RequestMapping("/login/{emailId}")
    public String userLogIn(@PathVariable String emailId) {
        List<User> currentUsers = userRepo.findAll();
        for (User usr: currentUsers) {
            if (usr.getEmail().equals(emailId)) {
                return "User with email " + emailId + " logged in!";
            }
        }
        return "Sorry, user with email " + emailId + " not found in our " +
                "database!";
    }
    @CrossOrigin
    @GetMapping("/getAllUsers")
    public List<User> getUsers() {
        return userRepo.findAll();
    }

    @CrossOrigin
    @DeleteMapping("/removeAllUsers")
    public String deleteAllUsers() {
        userRepo.deleteAll();
        return "Deleted all users from database!";
    }
}
