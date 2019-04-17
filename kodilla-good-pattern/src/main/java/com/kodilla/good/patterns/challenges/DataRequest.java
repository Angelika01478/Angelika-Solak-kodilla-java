package com.kodilla.good.patterns.challenges;

public class DataRequest {

    private User user;
    Basket basket;

    public DataRequest(User user, Basket basket) {
        this.user = user;
        this.basket = basket;

    }

    public User getUser() {
        return user;
    }

    public Basket getBasket() {
        return basket;
    }
}
