package com.testing.weather.mock;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.testing.weather.stub.Temperatures;
import com.testing.weather.stub.WeatherForecast;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class WeatherForecastTestSuite {
    @Test
    public void testCalculateForecastwithMock(){
        // given
        Temperatures temperaturesMock = mock(Temperatures.class);
        HashMap<Integer, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put(0, 21.0);
        temperaturesMap.put(1, 25.5);
        temperaturesMap.put(2, 25.5);
        temperaturesMap.put(3, 29.0);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);

        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        // when
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        // then
        Assert.assertEquals(4, quantityOfSensors);
    }
}
