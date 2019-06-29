package com.kodilla.good.patterns.flightService;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class RequestRetriver {

    FlighList flighList = new FlighList();

    public RequestData retrieve (){


        IntermediateStops intermediateStops = new IntermediateStops(new ArrayList<>());
        intermediateStops.addIntermediateStops("Frankfurt, Intl Airport");
        FlightDetails flightDetails = new FlightDetails(LocalDateTime.of(2019, 6, 19, 21,07,0), "Kraków, Balice" , "Barcelona, El Prat", intermediateStops );
        flighList.addNewFlight(1, flightDetails);

        IntermediateStops intermediateStops2 = new IntermediateStops(new ArrayList<>());
        intermediateStops2.addIntermediateStops("Frankfurt, Intl Airport");
        intermediateStops2.addIntermediateStops("Monachium, Franz Josef Strauss");
        FlightDetails flightDetails2 = new FlightDetails(LocalDateTime.of(2019, 6, 21, 11,21,0), "Kraków, Balice" , "Barcelona, El Prat", intermediateStops2 );
        flighList.addNewFlight(2, flightDetails2);

        IntermediateStops intermediateStops3 = new IntermediateStops(new ArrayList<>());
        FlightDetails flightDetails3 = new FlightDetails(LocalDateTime.of(2019, 6, 25, 06,05,0), "Warszawa, Okęcie" , "Zakintos, Dionysios Solomo",intermediateStops3 );
        flighList.addNewFlight(3, flightDetails3);

        IntermediateStops intermediateStops4 = new IntermediateStops(new ArrayList<>());
        FlightDetails flightDetails4 = new FlightDetails(LocalDateTime.of(2019, 6, 25, 06,05,0), "Kraków, Balice" , "Ateny, Eleftherios Venizelos",intermediateStops4 );
        flighList.addNewFlight(4, flightDetails4);

        IntermediateStops intermediateStops5 = new IntermediateStops(new ArrayList<>());
        FlightDetails flightDetails5 = new FlightDetails(LocalDateTime.of(2019, 6, 29, 14,05,0), "Warszawa, Okęcie" , "Madryt, Barajas",intermediateStops5 );
        flighList.addNewFlight(5, flightDetails5);

        return new RequestData(flighList);




    }
}