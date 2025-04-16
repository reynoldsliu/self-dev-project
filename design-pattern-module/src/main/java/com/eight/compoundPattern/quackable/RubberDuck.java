package com.eight.compoundPattern.quackable;

import com.eight.compoundPattern.observer.Observable;
import com.eight.compoundPattern.observer.Observer;

public class RubberDuck implements Quackable{

    Observable observable;

    public RubberDuck(){
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Squeak");
        this.notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        this.observable.notifyObservers();
    }

    @Override
    public String toString(){
        return "Rubber Duck";
    }
}
