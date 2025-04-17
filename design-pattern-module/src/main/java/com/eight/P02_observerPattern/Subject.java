package com.eight.P02_observerPattern;

public interface Subject<T extends Observer> {
    void addObserver(T observer);
    void removeObserver(T observer);
    void notifyObservers();
}
