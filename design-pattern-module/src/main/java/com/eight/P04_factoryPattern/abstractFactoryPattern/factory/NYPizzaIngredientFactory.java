package com.eight.P04_factoryPattern.abstractFactoryPattern.factory;

import com.eight.P04_factoryPattern.abstractFactoryPattern.Ingredient.CommonIngredient.SlicedPepperoni;
import com.eight.P04_factoryPattern.abstractFactoryPattern.Ingredient.NYPizzaIngredient.*;
import com.eight.P04_factoryPattern.abstractFactoryPattern.Ingredient.*;

import java.util.Arrays;
import java.util.List;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public List<Veggies> createVeggies() {
        return Arrays.asList(new Garlic(), new Onion(), new Mushroom(), new RedPepper());
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
