package com.eight.P13_compoundPattern.observer;


public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
