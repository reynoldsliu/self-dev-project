package com.eight.P03_decoratorPattern;

import java.util.ArrayList;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        if (this.getDescription() == null) {
            this.setDescription(new ArrayList<>());
        }
        this.getDescription().add("House Blend Coffee");
    }

    @Override
    public double cost() {
        return .89;
    }
}
