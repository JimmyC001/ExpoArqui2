package com.expo.cleanarchitechture.Users.UserLogin.Domain.ValueObjects;

import java.util.regex.Pattern;

public class UserLoginPassword {
    private String value;
    // Constructor
    public UserLoginPassword(String value){
        validate(value);
        this.value = value;
    }
    // Get Value
    public String value(){
        return this.value;
    }
    // Validator
    public void validate(String value){
        passwordFormValidation(value);
    }
    // Password Form Validation - verify length and minimal requirements of the password (lower, upper and numbers)
    private void passwordFormValidation(String value){
        if (value == null || value.isEmpty()) throw new RuntimeException("Contrasena invalida - el valor es nulo");
        if (!Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z]))").matcher(value).matches()) throw new RuntimeException("Contrasena invalida - La contrasena no tiene la forma correcta");
        if (value.length() < 8) throw new RuntimeException("Contrasena invalida - Debe tener al menos 8 caracteres");
    }
}
