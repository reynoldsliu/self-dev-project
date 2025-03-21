package com.eight.templateMethodPattern.originalDesign;

public class Coffee {

    public void prepareRecipe() {
        this.boilWater();
        this.brewCoffeeGrinds();
        this.pourInCup();
        this.addSugarAndMilk();
    }

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void brewCoffeeGrinds() {
        System.out.println("Dripping Coffee through filter");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public void addSugarAndMilk() {
        System.out.println("Adding sugar and milk");
    }
}
