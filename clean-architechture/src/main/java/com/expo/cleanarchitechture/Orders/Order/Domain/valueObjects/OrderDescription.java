package com.expo.cleanarchitechture.Orders.Order.Domain.valueObjects;

public class OrderDescription {
    private String description;

    public OrderDescription(String description) {
        validate(description);
        this.description = description;
    }

    private void validate(String description){
        formvalidation(description);
    }
    private void formvalidation(String description){
        if (description == null || description.isEmpty()) throw new RuntimeException("el valor es nulo");
    }
    public String value(){
        return  description;
    }
}
