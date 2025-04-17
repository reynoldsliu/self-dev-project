package com.eight.P02_observerPattern;

import org.junit.Test;

public class TestObserverPattern {

    @Test
    public void test(){
        WeatherData<Observer> weatherData = new WeatherData<>();
        WeatherObserver1 weatherObserver1 = new WeatherObserver1(weatherData);
        weatherData.setMeasurements(13.1, 100);
    }
}
