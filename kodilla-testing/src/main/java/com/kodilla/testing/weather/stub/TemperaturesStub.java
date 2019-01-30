package com.kodilla.testing.weather.stub;

import java.util.HashMap;

public class TemperaturesStub implements Temperatures {


    @Override
    public HashMap<Integer, Double> getTemperature() {

        HashMap<Integer,Double> stubResult = new HashMap<>();
        stubResult.put(1, 10.02);
        stubResult.put(2, 15.32);
        stubResult.put(3, 16.12);
        stubResult.put(4, 8.28);
        stubResult.put(5, 6.25);

        return stubResult;
    }
}
