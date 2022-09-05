package com.expo.cleanarchitechture.Orders.Order.Domain.valueObjects;

public class OrderAdress {
    private String Adress;

    public OrderAdress(String adress) {
        validate(adress);
        Adress = adress;
    }

    private void validate(String adress){

    }
}
