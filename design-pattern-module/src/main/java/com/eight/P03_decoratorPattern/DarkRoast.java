package com.eight.P03_decoratorPattern;

import java.util.ArrayList;

public class DarkRoast extends Beverage{

    public DarkRoast(){
        if(this.getDescription() ==null){
            this.setDescription(new ArrayList<>());
        }
        this.getDescription().add("Dark Roast Coffee");
    }

    @Override
    public double cost() {
        return .99;
    }
}
