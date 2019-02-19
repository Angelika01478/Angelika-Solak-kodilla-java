package com.kodilla.exception.test;

public class FindFlightRunner {

    public static void main(String[] args) {
        FlightFounder flightFounder = new FlightFounder();

       try {
           //flightFounder.findFlight(new Flight("Exeter", "Humberside"));
           flightFounder.findFlight(new Flight("Something", "Humberside"));
       }catch (RouteNotFoundException ex){
           System.out.println("Please check if the entered name is correct or select another airport.");
       }finally {
           System.out.println("More information about flights and insurance you can find on our website.");
       }

    }

}
