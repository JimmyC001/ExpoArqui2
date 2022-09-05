package com.expo.cleanarchitechture.Users.UserLogin.Domain.ValueObjects;

public class UserLoginId {
    private String value;
    // Constructor
    public UserLoginId(String value){
       this.value = value;
    }
    // Get value
    public String getValue(){
        return this.value;
    }
    // Validator
    public boolean validate(){
        return true;
    }
}
