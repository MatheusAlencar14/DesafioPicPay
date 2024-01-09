package com.dev.desafiopcp.controllers;

import com.dev.desafiopcp.dtos.UserDTO;
import com.dev.desafiopcp.entities.user.User;
import com.dev.desafiopcp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController("/users")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping
    public ResponseEntity<User> createUser(@PathVariable UserDTO userDTO) {
        User newUser = service.createUser(userDTO);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> list = this.service.getAllUsers();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
