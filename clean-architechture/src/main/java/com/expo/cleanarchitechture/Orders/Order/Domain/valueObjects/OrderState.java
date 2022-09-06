package com.expo.cleanarchitechture.Orders.Order.Domain.valueObjects;

public class OrderState {
    private int state;

    public OrderState(int state) {
        validate(state);
        this.state = state;
    }
    private void validate(int state){
        validrange(state);
    }
    private void validrange(int state){
        if (state>3 || state<1){
            throw new RuntimeException("el estado no existe");
        }
    }

}
