package com.eight.P03_decoratorPattern;

import java.util.List;

public class Whip extends CondimentDecorator{

    public Whip(Beverage beverage){
        this.beverage = beverage;
        this.beverage.getDescription().add("Whip");
    }

    @Override
    public List<String> getDescription() {
        return beverage.getDescription();
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }
}
