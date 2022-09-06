package com.expo.cleanarchitechture.Users.User.Domain.ValueObjects;

public class UserId {
    private Integer value;
    public UserId(Integer value){
        validate(value);
        this.value = value;
    }
    public Integer value(){
        return value;
    }
    private void validate(Integer value){
        idNumberValidation(value);
    }
    private void idNumberValidation(Integer value){
        if(value <= 0) throw new RuntimeException("Id no valido");
    }
}
