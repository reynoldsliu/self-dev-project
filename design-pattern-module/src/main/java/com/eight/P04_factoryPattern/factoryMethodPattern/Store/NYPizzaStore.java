package com.eight.P04_factoryPattern.factoryMethodPattern.Store;

import com.eight.P04_factoryPattern.factoryMethodPattern.Pizza.*;
import com.eight.P04_factoryPattern.factoryMethodPattern.Pizza.NYStylePizza.NYStyleCheesePizza;
import com.eight.P04_factoryPattern.factoryMethodPattern.Pizza.NYStylePizza.NYStyleClamPizza;
import com.eight.P04_factoryPattern.factoryMethodPattern.Pizza.NYStylePizza.NYStylePepperoniPizza;
import com.eight.P04_factoryPattern.factoryMethodPattern.Pizza.NYStylePizza.NYStyleVeggiePizza;
import org.apache.commons.lang3.StringUtils;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        if(StringUtils.equals(item, "cheese")){
            return new NYStyleCheesePizza();
        }else if (StringUtils.equals(item, "veggie")){
            return new NYStyleVeggiePizza();
        }else if (StringUtils.equals(item, "clam")){
            return new NYStyleClamPizza();
        }else if (StringUtils.equals(item, "pepperoni")){
            return new NYStylePepperoniPizza();
        }
        return null;
    }
}
