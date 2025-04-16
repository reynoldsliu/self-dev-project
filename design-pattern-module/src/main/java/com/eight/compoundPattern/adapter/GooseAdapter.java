package com.eight.compoundPattern.adapter;

import com.eight.compoundPattern.observer.Observable;
import com.eight.compoundPattern.observer.Observer;
import com.eight.compoundPattern.quackable.Quackable;

public class GooseAdapter implements Quackable {

    Observable observable;
    Goose goose;

    public GooseAdapter(Goose goose){
        this.goose = goose;
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        goose.honk();
        this.notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
    }
}
