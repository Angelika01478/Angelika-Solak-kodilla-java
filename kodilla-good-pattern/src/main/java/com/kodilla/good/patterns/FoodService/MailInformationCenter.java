package com.kodilla.good.patterns.FoodService;

public class MailInformationCenter implements InformSupplier {
    @Override
    public void inform() {
        System.out.println("The supplier has just received mail with all orders details");

    }
}
