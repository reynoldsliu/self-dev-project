package com.eight.compoundPattern.composition;

import com.eight.compoundPattern.observer.Observer;
import com.eight.compoundPattern.quackable.Quackable;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {

    ArrayList quackers = new ArrayList();

    public void add(Quackable quacker){
        this.quackers.add(quacker);
    }

    @Override
    public void quack() {
        Iterator iterator = quackers.iterator(); // 迭代器模式
        while (iterator.hasNext()){
            Quackable quacker = (Quackable) iterator.next();
            quacker.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        /* 當向 Flock 註冊觀察者時，
           其實等於向 Flock '內' 所有 Quackable 註冊，
           不管是一隻鴨子或是一個群。
         */
        Iterator iterator = this.quackers.iterator();
        while(iterator.hasNext()){
            Quackable duck = (Quackable) iterator.next();
            duck.registerObserver(observer);
            /* 我們遍歷 Flock 內所有 Quackable 把呼叫委託給每個 Quackable，
               如果 Quackable 是另一個Flock，做同樣的事。
             */
        }
    }

    @Override
    public void notifyObservers() {
        /* 每個 Quackable 都負責通知自己的觀察者
           這樣，Flock 就不用擔心如何實作通知所有觀察者了。
           當 Flock 將 quack() 委託給內部的每一個 Quackable 時，
           就是呼叫此方法的時機。
         */
    }
}
