package com.expo.cleanarchitechture.Users.User.Domain.ValueObjects;

import java.util.regex.Pattern;

public class UserPhone {
    private String value;
    public UserPhone(String value){
        validate(value);
        this.value = value;
    }
    public String value(){
        return value;
    }
    private void validate(String value){
        phoneFormValidation(value);
    }
    private void phoneFormValidation(String value){
        if(value == null || value.length() <= 0) throw new RuntimeException("Telefono no valido - El valor es nulo");
        if(!Pattern.compile("[(+\\d)]{4,6}\\d{7,15}").matcher(value).matches()) throw new RuntimeException("Telefono no valido - El valor no corresponde a un telefono valido");
    }
}
