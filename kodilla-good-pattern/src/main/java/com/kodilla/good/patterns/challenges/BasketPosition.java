package com.kodilla.good.patterns.challenges;

public class BasketPosition {

    private Product product;
    private int quantity;

    public BasketPosition(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
