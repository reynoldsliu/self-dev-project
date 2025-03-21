package com.eight.factoryPattern.abstractFactoryPattern.Pizza;

import com.eight.factoryPattern.abstractFactoryPattern.factory.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        setDough(ingredientFactory.createDough());
        setSauce(ingredientFactory.createSauce());
        setCheese(ingredientFactory.createCheese());
        setPepperoni(ingredientFactory.createPepperoni());
    }
}
