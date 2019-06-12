package com.testing.weather.stub;

import org.junit.Assert;
import org.junit.Test;

public class WeatherForecastTestSuite {
    @Test
    public void testCalculateForecastWithStub(){
        // given
        Temperatures temperatures;
        // we need here a stub (with dummy data - only for test)
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);

        // when
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        // then
        Assert.assertEquals(5, quantityOfSensors);
    }
}
