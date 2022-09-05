package com.expo.cleanarchitechture.Orders.Order.Domain.valueObjects;

public class OrderDescription {
    private String description;

    public OrderDescription(String description) {
        validate(description);
        this.description = description;
    }

    private void validate(String description){

    }
}
