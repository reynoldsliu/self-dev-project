package com.eight.P04_factoryPattern.abstractFactoryPattern.PizzaStore;

import com.eight.P04_factoryPattern.abstractFactoryPattern.Pizza.*;
import com.eight.P04_factoryPattern.abstractFactoryPattern.factory.PizzaIngredientFactory;
import com.eight.P04_factoryPattern.abstractFactoryPattern.factory.ChicagoPizzaIngredientFactory;
import org.apache.commons.lang3.StringUtils;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if(StringUtils.equals(item, "cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        }else if (StringUtils.equals(item, "veggie")){
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");
        }else if (StringUtils.equals(item, "clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        }else if (StringUtils.equals(item, "pepperoni")){
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        }
        return pizza;
    }
}
