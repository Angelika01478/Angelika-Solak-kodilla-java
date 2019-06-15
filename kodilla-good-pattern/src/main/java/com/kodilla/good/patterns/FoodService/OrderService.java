package com.kodilla.good.patterns.FoodService;

public class OrderService {

    public boolean order(OrderRequest orderRequest){
        if(orderRequest.getQuantity()>0){
            System.out.println("You ordered " + orderRequest.getQuantity() + " product/s: " + orderRequest.getProduct().getProductName() +" from category: " + orderRequest.getProduct().getProductCategory());
            return true;
        }else return false;
    }
}
