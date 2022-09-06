package com.expo.cleanarchitechture.Orders.Order.Domain;

import com.expo.cleanarchitechture.Orders.Order.Domain.valueObjects.OrderAdress;
import com.expo.cleanarchitechture.Orders.Order.Domain.valueObjects.OrderDate;
import com.expo.cleanarchitechture.Orders.Order.Domain.valueObjects.OrderDescription;
import com.expo.cleanarchitechture.Orders.Order.Domain.valueObjects.OrderState;
import com.expo.cleanarchitechture.Orders.Service.Domain.Service;
import com.expo.cleanarchitechture.Users.User.Domain.User;

import java.util.HashMap;

public class Order {
    private OrderAdress Adress;
    private OrderDate Date;
    private OrderDescription Description;
    private OrderState State;
    private Service service;
    private User Clin;
    private User Client;

    public Order(OrderAdress adress, OrderDate date, OrderDescription description, OrderState state, Service service, User clin, User client) {
        Adress = adress;
        Date = date;
        Description = description;
        State = state;
        service = service;
        Clin = clin;
        Client = client;
    }

    public OrderAdress getAdress() {
        return Adress;
    }

    public void setAdress(OrderAdress adress) {
        Adress = adress;
    }

    public OrderDate getDate() {
        return Date;
    }

    public void setDate(OrderDate date) {
        Date = date;
    }

    public OrderDescription getDescription() {
        return Description;
    }

    public void setDescription(OrderDescription description) {
        Description = description;
    }

    public OrderState getState() {
        return State;
    }

    public void setState(OrderState state) {
        State = state;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public User getClin() {
        return Clin;
    }

    public void setClin(User clin) {
        Clin = clin;
    }

    public User getClient() {
        return Client;
    }

    public void setClient(User client) {
        Client = client;
    }

    public HashMap<String,Object> data() {
        return new HashMap<>() {{
            put("Adress", Adress.value());
            put("Date", Date.value());
            put("Description", Description.value());
            put("State", State.value());
        }};
    }

}
