package com.kodilla.good.patterns.challenges;

public class Product {

    private String type;
    private String productName;
    private double price;

    public Product(String type, String productName, double price) {
        this.type = type;
        this.productName = productName;
        this.price = price;
    }


    public String getType() {
        return type;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "type='" + type + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
