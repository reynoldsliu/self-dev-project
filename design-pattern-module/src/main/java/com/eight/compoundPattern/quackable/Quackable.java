package com.eight.compoundPattern.quackable;

import com.eight.compoundPattern.observer.QuackObservable;

public interface Quackable extends QuackObservable {
    public void quack();
}
