package com.expo.cleanarchitechture.Users.UserLogin.Domain.ValueObjects;

public class UserLoginPassword {
    private String value;
    // Constructor
    public UserLoginPassword(String value){
        this.value = value;
    }
    // Get Value
    public String getValue(){
        return this.value;
    }
    // Validator
    public boolean validate(){
        return true;
    }
}
