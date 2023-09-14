package com.myNewProject.myNewProjectSpring.service;

import com.myNewProject.myNewProjectSpring.entity.User;
import com.myNewProject.myNewProjectSpring.entity.UserDto;
import org.springframework.stereotype.Service;

@Service
public class TransformUser {

    public UserDto TransformUserEntityInUserDTO(User user){
        UserDto newUserDto = new UserDto();

        newUserDto.setEmail(user.getEmail());
        newUserDto.setFirstname(user.getFirstname());
        newUserDto.setLastname(user.getLastname());

        return newUserDto;
    }
}
