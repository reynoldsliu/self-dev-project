package com.eight.decoratorPattern;

import java.util.List;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
        this.beverage.getDescription().add("Soy");
    }

    @Override
    public List<String> getDescription() {
        return this.beverage.getDescription();
    }

    @Override
    public double cost() {
        return beverage.cost() + .15;
    }
}
