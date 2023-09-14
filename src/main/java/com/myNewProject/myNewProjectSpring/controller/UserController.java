package com.myNewProject.myNewProjectSpring.controller;

import com.myNewProject.myNewProjectSpring.entity.User;
import com.myNewProject.myNewProjectSpring.repository.RoleRepository;
import com.myNewProject.myNewProjectSpring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    // CRUD USERS //

    @GetMapping("")
    @PreAuthorize("hasRole('ADMIN')")
    public List<User> getUsers() {
        return userRepository.findAll();
    }


    @GetMapping("/{email}")
    public User getProfile(@PathVariable String email) {
        return userRepository.findByEmail(email).get();
    }

    @DeleteMapping("/{email}")
    @PreAuthorize("hasRole('ADMIN')")
    public boolean deleteUser(@PathVariable String email) {
        User userToDelete = userRepository.findByEmail(email).get();
        userRepository.deleteById(userToDelete.getId());
        return true;
    }
}