package com.kodilla.good.patterns.flightService;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class FlighList {

    private static HashMap<Integer, FlightDetails> flightList = new HashMap<>();

    public static void addNewFlight(int uniqueId, FlightDetails flightDetails){
        flightList.put(uniqueId, flightDetails);
    }

    public static void removeFlight(int uniqieId){
        flightList.remove(uniqieId);
    }





    public static List<FlightDetails> findFlightsFrom(String from){
       int j=1;
       int k=0;
       List<FlightDetails> flights = flightList.entrySet().stream().map(flightList->flightList.getValue())
                .filter(flightDetails -> flightDetails.getFrom().equals(from))
                .collect(Collectors.toList());

        return showResults( j, flights);
    }

    private static List<FlightDetails> showResults( int j, List<FlightDetails> flights) {
        System.out.println("_______________ Found _______________" + flights.size() + " results" + "_______________\n");
        int k;
        for (FlightDetails s : flights){
            System.out.print("Flight no " + j + ": from " + s.getFrom() + " to " + s.getTo() +" \n");
            System.out.println("Details : Date " + s.getDateTime().toLocalDate() + " time " + s.getDateTime().toLocalTime() );
            if(s.getIntermediateStops().getIntermediateStopsList().size()>0){
                k=s.getIntermediateStops().getIntermediateStopsList().size();
                System.out.println("interchange : " + s.getIntermediateStops().getIntermediateStopsList().size());
                for (String list : s.getIntermediateStops().getIntermediateStopsList()){
                    System.out.print(list);
                    k--;
                    if(k>0){
                        System.out.print("; ");
                    }
                }
            }else {
                System.out.println("interchange : 0");
            }
            System.out.println("\n============================================================");
            j++;

        }
        return flights;
    }

    public static List<FlightDetails> findFlightsTo(String to){
        int j=1;
        int k=0;
        List<FlightDetails> flights = flightList.entrySet().stream().map(flightList->flightList.getValue())
                .filter(flightDetails -> flightDetails.getTo().equals(to))
                .collect(Collectors.toList());

        return showResults( j, flights);
    }


    public static List<FlightDetails> findFlightsBy(String by){
        int j=1;
        int k=0;
        List<FlightDetails> flights = flightList.entrySet().stream().map(flightList->flightList.getValue())
                .filter(flightDetails -> flightDetails.getIntermediateStops().getIntermediateStopsList().contains(by))
                .collect(Collectors.toList());

        return showResults( j, flights);
    }


}
