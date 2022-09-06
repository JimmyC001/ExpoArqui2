package com.expo.cleanarchitechture.Users.User.Domain.ValueObjects;

public class UserState {
    private String value;
    public UserState(String value){
        this.value= value;
    }
    public String value(){
        return value;
    }
    private void validate(String value){
        stateTypeValidation(value);
    }
    private void stateTypeValidation(String value){
        if(value == null) throw new RuntimeException("Estado invalido - El valor es nulo");
        else if(!value.equals("cliner") && !value.equals("client")) throw new RuntimeException("Estado invalido - El tipo de usuario no existe");
    }
}
