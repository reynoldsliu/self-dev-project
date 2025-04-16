package com.eight.compoundPattern.quackable;

import com.eight.compoundPattern.observer.Observable;
import com.eight.compoundPattern.observer.Observer;

public class MallardDuck implements Quackable{
    Observable observable;

    public MallardDuck(){
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
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
        return "Mallard Duck";
    }
}
