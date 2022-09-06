package com.expo.cleanarchitechture.Orders.Service.Domain.valueObjects;

public class ServiceId {

    public Integer  value;


    public ServiceId(Integer value){
        validate(value);
        this.value = value;
    }
    // Get value
    public Integer getValue(){
        return this.value;
    }

    // Validator
    public void validate(Integer value){
        if (value >= 0) throw new RuntimeException("id no valido");

    }
}
