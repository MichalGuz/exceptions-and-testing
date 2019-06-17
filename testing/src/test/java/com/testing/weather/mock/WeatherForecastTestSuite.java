package com.testing.weather.mock;

import static org.mockito.Mockito.mock;
import com.testing.weather.stub.Temperatures;
import org.junit.Test;

public class WeatherForecastTestSuite {
    @Test
    public void testCalculateForecastwithMock(){
        // given
        Temperatures temperaturesMock = mock(Temperatures.class) ;

        // when

        // then
    }
}
