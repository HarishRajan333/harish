package com.mycompany.keycloak.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

//    @Autowired
//    UserRepo userRepo;

    @PostMapping("/admin/add")
    public String addUser() {
        return "user Added.";
    }

    @GetMapping("/admin/get")
    public String getUser() {
        return "user one.";
    }

//    @PostMapping("/admin/add")
//    public User addUser(@RequestBody User user) {
//        return userRepo.save(user);
//    }
//
//    @GetMapping("/admin/add")
//    public List<User> getUser() {
//        return userRepo.findAll();
//    }
}
