package com.kodilla.testing.weather.stub;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class WeatherForecastTestSuite {

    @Test
    public void testCalculatedWeatherForecastWithStub(){
        //given
        Temperatures temperatures = new TemperaturesStub();
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);
        //when
        int quantityOfSensors= weatherForecast.calculatedForecast().size();
        //then
        Assert.assertEquals(5,quantityOfSensors);
    }

}
