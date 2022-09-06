package com.expo.cleanarchitechture.Users.UserLogin.Domain.ValueObjects;

import java.util.regex.Pattern;

public class UserLoginEmail {
    private String value;
    // Constructor
    public UserLoginEmail(String value){
        validate(value);
        this.value = value;
    }
    // Get Value
    public String value(){
        return this.value;
    }
    // Validator
    private void validate(String value){
        emailFormValidation(value);
    }
    //Email Form Validator - Validate email structure xxx@yyy.zzz
    private void emailFormValidation(String value) {
        if (value == null || value.isEmpty()) throw new RuntimeException("Email invalido - el valor es nulo");
        if(!Pattern.compile("[\\w-]{1,20}@\\w{2,20}\\.\\w{2,3}$").matcher(value).matches()) throw new RuntimeException("Email invalido - el email no tiene la forma correcta");
    }
}
