package com.kodilla.good.patterns.challenges;

public class Application {

    public static void main(String[] args) {


        DataRetriver dataRetriver = new DataRetriver();
        OrderProcessor orderProcessor= new OrderProcessor(new SmsInformationService(), new OrderRepository());
        orderProcessor.process(dataRetriver.retriver());




    }

}
