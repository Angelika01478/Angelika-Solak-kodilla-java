package com.kodilla.good.patterns.challenges;

public class DataRetriver {

    public DataRequest retriver() {

        User user = new User("John", "Smith");
        Product product1 = new Product("Dairy", "Milk", 3.5);
        Product product2 = new Product("Bread", "Bun", 1.5);
        Product product3 = new Product("Fruits", "Apple", 1.85);

        Basket basket = new Basket();

        basket.addProduct(new BasketPosition(product1,2));
        basket.addProduct(new BasketPosition(product2,1));
        basket.addProduct(new BasketPosition(product3,1));

        return  new DataRequest(user, basket);

    }



}
