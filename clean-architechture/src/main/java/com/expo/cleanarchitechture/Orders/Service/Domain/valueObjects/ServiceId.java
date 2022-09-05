package com.expo.cleanarchitechture.Orders.Service.Domain.valueObjects;

public class ServiceId {

    public String value;


    public ServiceId(String value){
        this.value = value;
    }

    // Get value
    public String getValue(){
        return this.value;
    }

    // Validator
    public boolean validate(){
        return true;
    }
}
