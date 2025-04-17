package com.eight.P09_templateMethodPattern.adjustedDesign;

public abstract class CaffeineBeverage {
    public final void prepareRecipe(){
        this.boilWater();
        this.brew();
        this.pourInCup();
        if(this.customerWantsCondiments()){
            this.addCondiments();
        }
    }
    abstract public void brew();
    abstract public void addCondiments();

    public void boilWater(){
        System.out.println("Boiling water");
    }

    public void pourInCup(){
        System.out.println("Pouring into cup");
    }

    // hook
    public boolean customerWantsCondiments(){
        return true;
    }
}
