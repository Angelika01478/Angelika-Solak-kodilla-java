package com.kodilla.good.patterns.FoodService;

public class OrderDTO {

    public Product product;
    public boolean isOrdered;

    public OrderDTO(Product product, boolean isOrdered) {
        this.product = product;
        this.isOrdered = isOrdered;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
