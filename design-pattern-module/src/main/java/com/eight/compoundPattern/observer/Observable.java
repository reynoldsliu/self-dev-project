package com.eight.compoundPattern.observer;

import java.util.ArrayList;
import java.util.Iterator;

public class Observable implements QuackObservable{

    ArrayList observers = new ArrayList();
    QuackObservable duck;

    public Observable(QuackObservable duck){
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()){
            Observer observer = (Observer) iterator.next();
            observer.update(this.duck);
        }
    }
}
