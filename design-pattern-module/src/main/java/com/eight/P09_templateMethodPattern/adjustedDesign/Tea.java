package com.eight.P09_templateMethodPattern.adjustedDesign;

public class Tea extends CaffeineBeverage{

    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
