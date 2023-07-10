package com.mycompany.keycloak.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

//    @Autowired
//    UserRepo userRepo;

    @GetMapping("/user/{id}")
    public String getUser(@PathVariable(value = "id") int id) {
        return "user id " + id;
    }

//    @GetMapping("/user/{id}")
//    public User getUser(@PathVariable(value = "id") int id) {
//        return userRepo.findById(id).get();
//    }
}
