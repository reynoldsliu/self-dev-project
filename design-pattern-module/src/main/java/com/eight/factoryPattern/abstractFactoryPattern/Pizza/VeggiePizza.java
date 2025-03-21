package com.eight.factoryPattern.abstractFactoryPattern.Pizza;

import com.eight.factoryPattern.abstractFactoryPattern.factory.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        setDough(ingredientFactory.createDough());
        setSauce(ingredientFactory.createSauce());
        setCheese(ingredientFactory.createCheese());
        setVeggiesList(ingredientFactory.createVeggies());
    }
}
