package com.kodilla.good.patterns.FoodService;

public class OrderRequestRetriever {

   public OrderRequest retrieve(){
       Product product = new Product("Milk", "Diary");

       int quantity = 15;

       return  new OrderRequest(product, quantity);
   }
}
