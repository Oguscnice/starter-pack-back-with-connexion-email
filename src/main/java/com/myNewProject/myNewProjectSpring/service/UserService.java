package com.myNewProject.myNewProjectSpring.service;

import com.myNewProject.myNewProjectSpring.entity.User;

import java.util.List;

public interface UserService {

    User createArticle(User article);

    List<User> findAll();

    User findById(Long id);

    User update(User article);

    void delete(User article);
}
