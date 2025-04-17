package com.eight.P04_factoryPattern.abstractFactoryPattern.Pizza;

import com.eight.P04_factoryPattern.abstractFactoryPattern.factory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        setDough(ingredientFactory.createDough());
        setSauce(ingredientFactory.createSauce());
        setCheese(ingredientFactory.createCheese());
    }
}
