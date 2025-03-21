package com.eight.decoratorPattern;

import java.util.ArrayList;

public class Espresso extends Beverage{

    public Espresso(){
        if(this.getDescription() ==null){
            this.setDescription(new ArrayList<>());
        }
        this.getDescription().add("Espresso");
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
