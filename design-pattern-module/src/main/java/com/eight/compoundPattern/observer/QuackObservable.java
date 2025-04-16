package com.eight.compoundPattern.observer;


public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
