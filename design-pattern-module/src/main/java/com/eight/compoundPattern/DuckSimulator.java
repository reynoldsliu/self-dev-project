package com.eight.compoundPattern;

import com.eight.compoundPattern.adapter.Goose;
import com.eight.compoundPattern.adapter.GooseAdapter;
import com.eight.compoundPattern.composition.Flock;
import com.eight.compoundPattern.decorator.QuackCounter;
import com.eight.compoundPattern.factory.AbstractDuckFactory;
import com.eight.compoundPattern.factory.CountingDuckFactory;
import com.eight.compoundPattern.observer.Quackologist;
import com.eight.compoundPattern.quackable.*;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
//        simulator.simulate();
//        simulator.simulate(duckFactory);
//        simulator.simulateWithComposite(duckFactory);
        simulator.simulateWithObserver(duckFactory);
    }

    void simulateWithObserver(AbstractDuckFactory duckFactory){
        Quackable redheadDuck = duckFactory.createRedheadDuck();// Factory Pattern 工廠模式
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        // Adapter Pattern 適配器模式
        Quackable gooseDuck = new GooseAdapter(new Goose());
        System.out.println("\nDuck Simulator: With Observer");

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();

        Flock flockOfMallards = new Flock();
        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

        flockOfDucks.add(flockOfMallards);

        /**Observer*/
        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);

        /*
          TRADE OFF
          add 不對任意組合內的子元素有用
          在此範例中需確認 Quackable 物件是 Flock 才能呼叫
          此處選擇了安全性而非透明性
         */

        System.out.println("\nDuck Simulator: Whole Flock Simulation");
        simulate(flockOfDucks);
        System.out.println("\nDuck Simulator: Mallards Simulation");
        simulate(flockOfMallards);
        System.out.println("The ducks quacked "+ QuackCounter.getQuacks()+" times");
    }

    void simulateWithComposite(AbstractDuckFactory duckFactory){
        Quackable redheadDuck = duckFactory.createRedheadDuck();// Factory Pattern 工廠模式
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        // Adapter Pattern 適配器模式
        Quackable gooseDuck = new GooseAdapter(new Goose());
        System.out.println("\nDuck Simulator: With Composite - Flock");

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();

        Flock flockOfMallards = new Flock();
        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

        flockOfDucks.add(flockOfMallards);

        /*
          TRADE OFF
          add 不對任意組合內的子元素有用
          在此範例中需確認 Quackable 物件是 Flock 才能呼叫
          此處選擇了安全性而非透明性
         */

        System.out.println("\nDuck Simulator: Whole Flock Simulation");
        simulate(flockOfDucks);
        System.out.println("\nDuck Simulator: Mallards Simulation");
        simulate(flockOfMallards);
        System.out.println("The ducks quacked "+ QuackCounter.getQuacks()+" times");
    }

    void simulate(AbstractDuckFactory duckFactory){
        Quackable mallardDuck = duckFactory.createMallardDuck();// Factory Pattern 工廠模式
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        // Adapter Pattern 適配器模式
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulator: With Abstract Factory");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
        System.out.println("The ducks quacked "+ QuackCounter.getQuacks()+" times");
    }

    void simulate(){
        Quackable mallardDuck = new QuackCounter(new MallardDuck());// Decorator Pattern 裝飾者模式
        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        // Adapter Pattern 適配器模式
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulator");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
        System.out.println("The ducks quacked "+ QuackCounter.getQuacks()+" times");
    }

    void simulate(Quackable duck){
        duck.quack();
    }
}
