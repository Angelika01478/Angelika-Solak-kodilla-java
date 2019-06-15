package com.kodilla.good.patterns.FoodService;

public class OrderRepository {

    public boolean saveData(OrderRequest orderRequest){
        if(orderRequest.getQuantity()>0){

            System.out.println("Details of the transactions have just saved to database.");

            return true;
        }else return false;
    }

}
