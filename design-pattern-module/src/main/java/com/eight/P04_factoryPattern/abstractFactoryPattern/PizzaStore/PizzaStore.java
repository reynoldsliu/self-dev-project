package com.eight.P04_factoryPattern.abstractFactoryPattern.PizzaStore;

import com.eight.P04_factoryPattern.abstractFactoryPattern.Pizza.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
