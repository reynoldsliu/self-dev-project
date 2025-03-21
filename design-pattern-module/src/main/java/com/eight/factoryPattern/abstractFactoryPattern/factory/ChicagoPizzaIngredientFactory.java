package com.eight.factoryPattern.abstractFactoryPattern.factory;

import com.eight.factoryPattern.abstractFactoryPattern.Ingredient.*;
import com.eight.factoryPattern.abstractFactoryPattern.Ingredient.ChicagoPizzaIngredient.*;
import com.eight.factoryPattern.abstractFactoryPattern.Ingredient.CommonIngredient.SlicedPepperoni;

import java.util.Arrays;
import java.util.List;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Mozzarella();
    }

    @Override
    public List<Veggies> createVeggies() {
        return Arrays.asList(new BlackOlives(), new Spinach(), new EggPlant());
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
