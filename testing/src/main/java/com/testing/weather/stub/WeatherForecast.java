package com.testing.weather.stub;

import java.util.HashMap;

public class WeatherForecast {
    Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures){
        this.temperatures = temperatures;
    }

    public HashMap<Integer, Double> calculateForecast() {
        HashMap<Integer, Double> results = new HashMap<Integer, Double>();
        return results;
    }
}
