package com.eight.observerPattern;

public interface Subject<T extends Observer> {
    void addObserver(T observer);
    void removeObserver(T observer);
    void notifyObservers();
}
