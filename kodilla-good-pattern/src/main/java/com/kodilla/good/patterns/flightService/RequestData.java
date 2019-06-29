package com.kodilla.good.patterns.flightService;

public class RequestData {

    private FlighList flighList;

    public RequestData(FlighList flighList) {
        this.flighList = flighList;
    }

    public FlighList getFlighList() {
        return flighList;
    }

    public void setFlighList(FlighList flighList) {
        this.flighList = flighList;
    }
}
