package com.eight.P09_templateMethodPattern.adjustedDesign;

public class Coffee extends CaffeineBeverage {
    private String needCondiments;

    public Coffee(String needCondiments){
        this.needCondiments = needCondiments;
    }

    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    public boolean customerWantsCondiments() {
        if (this.needCondiments.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }
}
