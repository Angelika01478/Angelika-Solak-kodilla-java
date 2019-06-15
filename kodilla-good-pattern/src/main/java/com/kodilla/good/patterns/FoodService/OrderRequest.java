package com.kodilla.good.patterns.FoodService;

public class OrderRequest {

    private Product product;
    private int quantity;

    public OrderRequest(Product product, int quantity) {
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
