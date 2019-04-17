package com.kodilla.good.patterns.challenges;

public class OrderRepository {
    public static int numberOfOrder;
    public boolean createOrder (Basket basket){
        numberOfOrder++;
        if(basket.showBasketSize()>0) {
            System.out.println("\nThe order number " + numberOfOrder + " created!");
            return true;
        }
        System.out.println("Ups, something went wrong, please try again");
        return false;
    }

}
