package com.expo.cleanarchitechture.Users.User.Domain.ValueObjects;

import java.util.regex.Pattern;

public class UserEmail {
    private String value;
    public UserEmail(String value){
        this.value = value;
    }
    public String value(){
        return value;
    }
    private void validate(String value){
        emailFormValidation(value);
    }
    private void emailFormValidation(String value){
        if (value == null || value.isEmpty()) throw new RuntimeException("Email invalido - el valor es nulo");
        if(!Pattern.compile("[\\w-]{1,20}@\\w{2,20}\\.\\w{2,3}$").matcher(value).matches()) throw new RuntimeException("Email invalido - el email no tiene la forma correcta");
    }
}
