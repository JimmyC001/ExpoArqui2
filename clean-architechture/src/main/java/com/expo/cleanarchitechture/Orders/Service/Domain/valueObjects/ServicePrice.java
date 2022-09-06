package com.expo.cleanarchitechture.Orders.Service.Domain.valueObjects;

public class ServicePrice {

    int value;

    public ServicePrice(int value) {
        validate(value);
        this.value = value;
    }

    public int getValue(){
        return value;
    }
    public void validate(int value){
        if (value <=0) throw new RuntimeException("El numero tiene que ser mayor que 0");
    }
}
