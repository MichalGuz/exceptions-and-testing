package com.testing.weather.stub;

import java.util.HashMap;

public class TemperaturesStub implements Temperatures{
    @Override
    public HashMap<Integer, Double> getTemperatures() {
        HashMap<Integer, Double> stubResult = new HashMap<Integer, Double>();
        return  stubResult;
    }
}
