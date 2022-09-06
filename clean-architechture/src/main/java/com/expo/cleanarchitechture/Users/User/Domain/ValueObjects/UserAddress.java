package com.expo.cleanarchitechture.Users.User.Domain.ValueObjects;

public class UserAddress {
    private String value;
    public UserAddress(String value){
        validate(value);
        this.value = value;
    }
    public String value(){
        return value;
    }
    private void validate(String value){
        addressLengthValidation(value);
        addressFormValidation(value);
    }
    private void addressLengthValidation(String value){
        if(value == null || value.length() <= 0) throw new RuntimeException("Direccion no valida - El valor es nulo");
    }
    private void addressFormValidation(String value){

    }
}
