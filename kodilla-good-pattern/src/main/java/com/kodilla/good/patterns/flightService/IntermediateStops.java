package com.kodilla.good.patterns.flightService;

import java.util.List;

public class IntermediateStops {

    private  List<String> intermediateStopsList;

    public IntermediateStops(List<String> intermediateStopsList) {
        this.intermediateStopsList = intermediateStopsList;
    }

    public List<String> getIntermediateStopsList() {
        return intermediateStopsList;
    }


    public void addIntermediateStops(String town){
        intermediateStopsList.add(town);
    }

    @Override
    public String toString() {
        return "IntermediateStops{" +
                "intermediateStopsList=" + intermediateStopsList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IntermediateStops that = (IntermediateStops) o;

        if (intermediateStopsList != null ? intermediateStopsList.equals(that.intermediateStopsList) : that.intermediateStopsList == null)
            return true;
        else return false;
    }

    @Override
    public int hashCode() {
        return intermediateStopsList != null ? intermediateStopsList.hashCode() : 0;
    }
}
