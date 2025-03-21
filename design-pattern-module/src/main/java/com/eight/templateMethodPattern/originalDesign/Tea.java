package com.eight.templateMethodPattern.originalDesign;

public class Tea {
    public void prepareRecipe() {
        this.boilWater();
        this.steepTeaBag();
        this.pourInCup();
        this.addLemon();
    }

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void steepTeaBag() {
        System.out.println("Steeping the tea");

    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public void addLemon() {
        System.out.println("Adding Lemon");

    }
}
