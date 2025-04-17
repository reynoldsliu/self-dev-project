package com.eight.P02_observerPattern;

import lombok.Data;

@Data
public class WeatherObserver1 implements Observer, DisplayElement {

    private double temperature;

    private double pressure;

    private WeatherData<Observer> weatherData;

    public WeatherObserver1(WeatherData<Observer> weatherData) {
        this.weatherData = weatherData;
        this.weatherData.addObserver(this);
    }

    @Override
    public void update() {
        this.temperature = this.weatherData.getTemperature();
        this.pressure = this.weatherData.getPressure();
        this.display();
    }

    @Override
    public void display() {
        System.out.println("Temperature : " + this.temperature + "C\n" +
        "Pressure : " + this.pressure + "hPa");
    }
}
