package com.kodilla.good.patterns.FoodService;

public class Application {
    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriver = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriver.retrieve();

        Supplier supplier = new ExtraFoodShop(new MailInformationCenter(), new OrderService(), new OrderRepository(), new TransactionSystem());
        Supplier supplier2 = new HealthyShop(new B2BInformationCenter(), new OrderService(), new OrderRepository(), new TransactionSystem());
        Supplier supplier3 = new GlutenFreeShop(new B2BInformationCenter(), new OrderService(), new OrderRepository(), new TransactionSystem());


        supplier.process(orderRequest);
        supplier2.process(orderRequest);
        supplier3.process(orderRequest);

    }
}
