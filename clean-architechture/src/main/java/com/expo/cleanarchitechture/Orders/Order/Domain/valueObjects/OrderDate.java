package com.expo.cleanarchitechture.Orders.Order.Domain.valueObjects;

import java.util.Date;

public class OrderDate {
    private Date fecha;

    public OrderDate(Date fecha) {
        validate(fecha);
        this.fecha = fecha;
    }
    private void validate(Date fecha){

    }
    public Date value(){
        return fecha;
    }
}
