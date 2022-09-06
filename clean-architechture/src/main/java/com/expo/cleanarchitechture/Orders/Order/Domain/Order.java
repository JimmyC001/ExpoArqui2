package com.expo.cleanarchitechture.Orders.Order.Domain;

import com.expo.cleanarchitechture.Orders.Order.Domain.valueObjects.OrderAdress;
import com.expo.cleanarchitechture.Orders.Order.Domain.valueObjects.OrderDate;
import com.expo.cleanarchitechture.Orders.Order.Domain.valueObjects.OrderDescription;
import com.expo.cleanarchitechture.Orders.Order.Domain.valueObjects.OrderState;
import com.expo.cleanarchitechture.Orders.Service.Domain.Service;
import com.expo.cleanarchitechture.Users.User.Domain.User;

import java.util.HashMap;

public class Order {
    private OrderAdress OrderAdress;
    private OrderDate OrderDate;
    private OrderDescription OrderDescription;
    private OrderState OrderState;
    private Service OrdeService;
    private User OrderClin;
    private User OrderClient;

    public Order(com.expo.cleanarchitechture.Orders.Order.Domain.valueObjects.OrderAdress orderAdress, com.expo.cleanarchitechture.Orders.Order.Domain.valueObjects.OrderDate orderDate, com.expo.cleanarchitechture.Orders.Order.Domain.valueObjects.OrderDescription orderDescription, com.expo.cleanarchitechture.Orders.Order.Domain.valueObjects.OrderState orderState, Service ordeService, User orderClin, User orderClient) {
        OrderAdress = orderAdress;
        OrderDate = orderDate;
        OrderDescription = orderDescription;
        OrderState = orderState;
        OrdeService = ordeService;
        OrderClin = orderClin;
        OrderClient = orderClient;
    }

    public HashMap<String,Object> data() {
        return new HashMap<>() {{
            put("Adress", OrderAdress.value());
            put("Date", OrderDate.value());
            put("Description", OrderDescription.value());
            put("State", OrderState.value());
        }};
    }
}
