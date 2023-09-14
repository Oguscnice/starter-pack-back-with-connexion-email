package com.myNewProject.myNewProjectSpring.payload.request;

import com.sun.istack.NotNull;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

import java.util.Set;

public class SignupRequest {
    @NotNull
    @Size(min = 1, max = 30)
    private String firstname;

    @NotNull
    @Size(min = 1, max = 30)
    private String lastname;

    @NotNull
    @Size(max = 50)
    @Email
    private String email;

    @NotNull
    @Size(min = 6, max = 40)
    private String password;

    @NotNull
    @Size(min = 2, max = 40)
    private String school;

    private Set<String> roles;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<String> getRoles() {
        return this.roles;
    }


    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
