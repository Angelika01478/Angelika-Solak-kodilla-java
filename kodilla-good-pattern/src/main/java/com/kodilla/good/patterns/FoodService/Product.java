package com.kodilla.good.patterns.FoodService;

public class Product {

    private String productName;
    private String productCategory;

    public Product(String productName, String productCategory) {
        this.productName = productName;
        this.productCategory = productCategory;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductCategory() {
        return productCategory;
    }
}
