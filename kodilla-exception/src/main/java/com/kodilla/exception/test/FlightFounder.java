package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFounder {

    public void findFlight(Flight flight) throws RouteNotFoundException {

        HashMap<String, Boolean> airports = new HashMap<>();
        airports.put("Leeds-Bradford" , true);
        airports.put("Londyn-Heathrow" , true);
        airports.put("Exeter" , true);
        airports.put("Humberside" , true);
        airports.put("Cardiff" , true);
        airports.put("Croydon" , false);
        airports.put("RAF Binbrook" , false);


        if (!airports.containsKey(flight.getArrivalAirport()) ||!airports.containsKey(flight.getDepartureAirport()) ){
            throw new RouteNotFoundException("Airport does not exist!");
        }else {
            if (airports.get(flight.getArrivalAirport()) && airports.get(flight.getDepartureAirport()) ) {
                System.out.println("You chose the flight from  " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport());
            }else {
                System.out.println("Sorry the airport is temporary closed");
            }
        }

    }

}
