package com.eight.observerPattern;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public class WeatherData<T extends Observer> implements Subject<T> {

    public double getPressure() {
        return pressure;
    }

    public double getTemperature() {
        return temperature;
    }

    private double temperature;

    private double pressure;

    List<T> observers;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(T observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(T observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (T observer : this.observers) {
            observer.update();
        }
    }

    public void measurementsChanged(){
        this.notifyObservers();
    }

    public void setMeasurements(double temperature, double pressure){
        this.temperature = temperature;
        this.pressure = pressure;
        this.measurementsChanged();
    }

}
