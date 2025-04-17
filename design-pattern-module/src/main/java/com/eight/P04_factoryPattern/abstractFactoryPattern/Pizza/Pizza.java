package com.eight.P04_factoryPattern.abstractFactoryPattern.Pizza;

import com.eight.P04_factoryPattern.abstractFactoryPattern.Ingredient.*;
import lombok.Data;

import java.util.List;
import java.util.Objects;

@Data
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    List<Veggies> veggiesList;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place the pizza in official PizzaStore box");
    }

    @Override
    public String toString() {
        return getDough().toString() + "\n" +
                getSauce().toString() + "\n" +
                Objects.toString(getVeggiesList(), "no veggies") + "\n" +
                Objects.toString(getCheese(), "no cheese") + "\n" +
                Objects.toString(getPepperoni(), "no pepperoni") + "\n" +
                Objects.toString(getClams(), "no clams");
    }
}
