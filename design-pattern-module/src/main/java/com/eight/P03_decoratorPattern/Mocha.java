package com.eight.P03_decoratorPattern;

import java.util.List;

public class Mocha extends CondimentDecorator{

    public Mocha(Beverage beverage){
        this.beverage = beverage;
        this.beverage.getDescription().add("Mocha");
    }

    @Override
    public List<String> getDescription() {
        return beverage.getDescription();
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }
}
