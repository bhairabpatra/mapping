package com.mapping.user.controller;

import com.mapping.employeeEntity.Department;
import com.mapping.user.entiry.User;
import com.mapping.user.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/")
public class UserControllers {

    @Autowired
    private UserService userService;
    @PostMapping("createUser")
    public ResponseEntity<User> createUser(@RequestBody User user){
            User newUser = userService.createUser(user);
            return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

    @GetMapping("getUser/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id){
        User newUser = userService.getCredential(id);
        return new ResponseEntity<>(newUser, HttpStatus.OK);
    }
}
