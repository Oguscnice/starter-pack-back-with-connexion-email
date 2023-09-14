package com.myNewProject.myNewProjectSpring.controller;

import com.myNewProject.myNewProjectSpring.exception.ObjectNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(ObjectNotFoundException.class)
    ResponseEntity<String> handleArticleNotFoundException(ObjectNotFoundException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Objet non trouvé");
    }

}
