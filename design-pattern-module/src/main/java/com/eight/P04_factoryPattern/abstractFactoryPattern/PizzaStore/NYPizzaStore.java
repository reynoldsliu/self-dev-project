package com.eight.P04_factoryPattern.abstractFactoryPattern.PizzaStore;

import com.eight.P04_factoryPattern.abstractFactoryPattern.Pizza.*;
import com.eight.P04_factoryPattern.abstractFactoryPattern.factory.PizzaIngredientFactory;
import com.eight.P04_factoryPattern.abstractFactoryPattern.factory.NYPizzaIngredientFactory;
import org.apache.commons.lang3.StringUtils;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if(StringUtils.equals(item, "cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }else if (StringUtils.equals(item, "veggie")){
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        }else if (StringUtils.equals(item, "clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }else if (StringUtils.equals(item, "pepperoni")){
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }
        return pizza;
    }
}
