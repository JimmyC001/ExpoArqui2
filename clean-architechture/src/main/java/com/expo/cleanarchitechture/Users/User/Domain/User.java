package com.expo.cleanarchitechture.Users.User.Domain;

import com.expo.cleanarchitechture.Users.User.Domain.ValueObjects.*;

import java.util.HashMap;

public class User {
    private UserId id;
    private UserName name;
    private UserEmail email;
    private UserPhone phone;
    private UserAddress address;
    private UserState state;

    public User(UserId id, UserName name, UserEmail email, UserPhone phone, UserAddress address, UserState state) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.state = state;
    }

    public UserId getId() {
        return id;
    }

    public void setId(UserId id) {
        this.id = id;
    }

    public UserName getName() {
        return name;
    }

    public void setName(UserName name) {
        this.name = name;
    }

    public UserEmail getEmail() {
        return email;
    }

    public void setEmail(UserEmail email) {
        this.email = email;
    }

    public UserPhone getPhone() {
        return phone;
    }

    public void setPhone(UserPhone phone) {
        this.phone = phone;
    }

    public UserAddress getAddress() {
        return address;
    }

    public void setAddress(UserAddress address) {
        this.address = address;
    }

    public UserState getState() {
        return state;
    }

    public void setState(UserState state) {
        this.state = state;
    }
    // To mapping
    public HashMap<String, Object> data(){
        return new HashMap<>(){{
            put("id", id.value());
            put("name", name.value());
            put("email", email.value());
            put("phone", phone.value());
            put("address", address.value());
            put("state", state.value());
        }};
    }
}
