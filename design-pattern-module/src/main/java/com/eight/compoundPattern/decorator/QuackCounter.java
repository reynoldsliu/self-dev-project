package com.eight.compoundPattern.decorator;

import com.eight.compoundPattern.observer.Observable;
import com.eight.compoundPattern.observer.Observer;
import com.eight.compoundPattern.quackable.Quackable;

public class QuackCounter implements Quackable {

    Observable observable;
    Quackable duck;
    static int numberOfQuacks;

    public QuackCounter(Quackable duck){
        this.observable = new Observable(this);
        this.duck = duck;
    }

    @Override
    public void quack() {
        this.duck.quack();
        QuackCounter.numberOfQuacks++;
        this.notifyObservers();
    }

    public static int getQuacks(){
        return QuackCounter.numberOfQuacks;
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
        return this.duck.toString();
    }
}
