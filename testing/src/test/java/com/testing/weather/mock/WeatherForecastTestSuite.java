package com.testing.weather.mock;

import static org.mockito.Mockito.mock;
import com.testing.weather.stub.Temperatures;
import com.testing.weather.stub.WeatherForecast;
import org.junit.Test;

public class WeatherForecastTestSuite {
    @Test
    public void testCalculateForecastwithMock(){
        // given
        Temperatures temperaturesMock = mock(Temperatures.class) ;
        //WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        // when

        // then
    }
}
