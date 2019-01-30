package com.kodilla.testing.weather.mock;


import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;


import java.util.HashMap;


public class WeatherForecastTestSuite {

    @Test
   public void testCalculatedWeatherForecastWithMock() {

        //given
        Temperatures temperaturesM = Mockito.mock(Temperatures.class);
        HashMap<Integer, Double> temperaturesMap = new HashMap<>();

        temperaturesMap.put(1,0.8);
        temperaturesMap.put(2,1.5);
        Mockito.when(temperaturesM.getTemperature()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesM);
        //when
        int quantityOfSensors=weatherForecast.calculatedForecast().size();
        //then
        Assert.assertEquals(2,quantityOfSensors);
    }
}
