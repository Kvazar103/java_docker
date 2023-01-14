package com.example.java_docker.controllers;

import com.example.java_docker.dao.UserRepository;
import com.example.java_docker.models.UserModel;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {
    private UserRepository userRepository;

    @GetMapping
    public List<UserModel> getAll(){
        return userRepository.findAll();
    }
    @PostMapping
    public UserModel create(@RequestBody UserModel user){
        return userRepository.save(user);
    }

}
