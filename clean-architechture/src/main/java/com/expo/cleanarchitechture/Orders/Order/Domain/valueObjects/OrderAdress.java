package com.expo.cleanarchitechture.Orders.Order.Domain.valueObjects;

public class OrderAdress {
    private String Adress;

    public OrderAdress(String adress) {
        validate(adress);
        Adress = adress;
    }

    private void validate(String adress){
        formvalidation(adress);
    }
    private void formvalidation(String adress){
        if (adress == null || adress.isEmpty()) throw new RuntimeException("el valor es nulo");
    }
    public String value(){
        return Adress;
    }
}
