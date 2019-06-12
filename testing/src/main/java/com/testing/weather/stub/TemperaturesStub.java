package com.testing.weather.stub;

import java.util.HashMap;

public class TemperaturesStub implements Temperatures{
    @Override
    public HashMap<Integer, Double> getTemperatures() {
        HashMap<Integer, Double> stubResult = new HashMap<Integer, Double>();

        // so-called dummy data
        stubResult.put(0, 20.5);
        stubResult.put(1, 24.5);
        stubResult.put(2, 21.5);
        stubResult.put(3, 23.0);
        stubResult.put(4, 25.5);

        return  stubResult;
    }
}
