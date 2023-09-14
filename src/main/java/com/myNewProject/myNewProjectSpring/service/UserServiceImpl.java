package com.myNewProject.myNewProjectSpring.service;


import com.myNewProject.myNewProjectSpring.entity.User;
import com.myNewProject.myNewProjectSpring.exception.ObjectNotFoundException;
import com.myNewProject.myNewProjectSpring.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    UserRepository userRepository;

    UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createArticle(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return this.userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        return this.userRepository.findById(id).orElseThrow(ObjectNotFoundException::new);
    }

    @Override
    public User update(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public void delete(User user) {
        this.userRepository.delete(user);
    }
}
