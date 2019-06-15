package com.kodilla.good.patterns.FoodService;

public class TransactionSystem {

    public void showStatusAvailable(){
        System.out.println("==============================================");
        System.out.println("The product is available");
        System.out.println("The process was completed");
        System.out.println("==============================================");
    }

    public void showStatusNotAvailable() {
        System.out.println("==============================================");
        System.out.println("The product is not available in the required quantity.");
        System.out.println("Try to reduce the quantity or choose a different product.");
        System.out.println("The order has been rejected.");
        System.out.println("=============================================="+"\n\n");
    }

    }


