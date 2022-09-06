package com.expo.cleanarchitechture.Users.UserLogin.Domain.ValueObjects;

public class UserLoginId {
    private Integer value;
    // Constructor
    public UserLoginId(Integer value){
        validate(value);
        this.value = value;
    }
    // Get value
    public Integer value(){
        return this.value;
    }
    // Validator
    private void validate(Integer value){
        idLengthValidation(value);
    }
    // Id lenght validation
    private void idLengthValidation(Integer value){
        if(value == null || value <= 0) throw new RuntimeException("Id de usuario no valido");
    }
}
