package com.expo.cleanarchitechture.Users.UserLogin.Domain;

import com.expo.cleanarchitechture.Users.UserLogin.Domain.ValueObjects.UserLoginEmail;
import com.expo.cleanarchitechture.Users.UserLogin.Domain.ValueObjects.UserLoginId;
import com.expo.cleanarchitechture.Users.UserLogin.Domain.ValueObjects.UserLoginPassword;

import java.util.HashMap;

public class UserLogin {
    private UserLoginId id;
    private UserLoginEmail email;
    private UserLoginPassword pass;
    public UserLogin(UserLoginId id, UserLoginEmail email, UserLoginPassword pass) {
        this.id = id;
        this.email = email;
        this.pass = pass;
    }
    public UserLoginId getId() {
        return id;
    }
    public void setId(UserLoginId id) {
        this.id = id;
    }
    public UserLoginEmail getEmail() {
        return email;
    }
    public void setEmail(UserLoginEmail email) {
        this.email = email;
    }
    public UserLoginPassword getPass() {
        return pass;
    }
    public void setPass(UserLoginPassword pass) {
        this.pass = pass;
    }
    // To primitive
    // To mapping
    public HashMap<String, Object> data(){
        return new HashMap<>(){{
            put("id", id.value());
            put("email", email.value());
            put("pass", pass.value());
        }};
    }
}
