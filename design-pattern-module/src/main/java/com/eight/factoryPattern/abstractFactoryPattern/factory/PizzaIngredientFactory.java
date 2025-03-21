package com.eight.factoryPattern.abstractFactoryPattern.factory;

import com.eight.factoryPattern.abstractFactoryPattern.Ingredient.*;

import java.util.List;

public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public List<Veggies> createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();

}
