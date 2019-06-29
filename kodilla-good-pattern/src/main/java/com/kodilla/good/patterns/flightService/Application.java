package com.kodilla.good.patterns.flightService;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        RequestRetriver requestRetriver = new RequestRetriver();

      //  requestRetriver.retrieve().getFlighList().findFlightsFrom("Kraków, Balice");

       // requestRetriver.retrieve().getFlighList().findFlightsTo("Barcelona, El Prat");


        requestRetriver.retrieve().getFlighList().findFlightsBy("Frankfurt, Intl Airport");
    }
}
