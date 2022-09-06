package com.expo.cleanarchitechture.Orders.Service.Domain.valueObjects;

public class ServiceToDo {

    public String value;

    //constructor
    public ServiceToDo(String value){
        validate(value);
        this.value= value;
    }
    // Get value
    public String getValue(){
        return this.value;
    }

    // Validator
    private void validate(String value){
        if (value == null || value.isEmpty()) throw new RuntimeException("Ingrese una descripción");
    }
}
