package com.expo.cleanarchitechture.Users.User.Domain.ValueObjects;

public class UserName {
    private String value;
    public UserName(String value){
        validate(value);
        this.value = value;
    }
    public String value(){
        return value;
    }
    private void validate(String value){
        nameNullValueValidation(value);
    }
    private void nameNullValueValidation(String value){
        if(value == null || value.length() <= 0) throw new RuntimeException("Nombre vacio");
    }
}
