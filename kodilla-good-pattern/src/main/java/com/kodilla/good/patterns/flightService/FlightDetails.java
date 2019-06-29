package com.kodilla.good.patterns.flightService;

import java.time.LocalDateTime;

public class FlightDetails {

    private LocalDateTime dateTime;
    private String from;
    private String to;
    private IntermediateStops intermediateStops;

    public FlightDetails(LocalDateTime dateTime, String from, String to, IntermediateStops intermediateStops) {
        this.dateTime = dateTime;
        this.from = from;
        this.to = to;
        this.intermediateStops = intermediateStops;
    }




    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public IntermediateStops getIntermediateStops() {
        return intermediateStops;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightDetails that = (FlightDetails) o;

        if (dateTime != null ? !dateTime.equals(that.dateTime) : that.dateTime != null) return false;
        if (from != null ? !from.equals(that.from) : that.from != null) return false;
        if (to != null ? !to.equals(that.to) : that.to != null) return false;
        return intermediateStops != null ? intermediateStops.equals(that.intermediateStops) : that.intermediateStops == null;
    }

    @Override
    public int hashCode() {
        int result = dateTime != null ? dateTime.hashCode() : 0;
        result = 31 * result + (from != null ? from.hashCode() : 0);
        result = 31 * result + (to != null ? to.hashCode() : 0);
        result = 31 * result + (intermediateStops != null ? intermediateStops.hashCode() : 0);
        return result;
    }
}
