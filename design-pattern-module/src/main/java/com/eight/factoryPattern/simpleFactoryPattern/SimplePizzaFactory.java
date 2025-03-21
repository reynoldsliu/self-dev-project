package com.eight.factoryPattern.simpleFactoryPattern;

import com.eight.factoryPattern.simpleFactoryPattern.Pizza.*;
import org.apache.commons.lang3.StringUtils;

public class SimplePizzaFactory {

    public Pizza createPizza(String type){
        Pizza pizza = null;

        if(StringUtils.equals(type, "cheese")){
            pizza = new CheesePizza();
        } else if(StringUtils.equals(type, "pepperoni")){
            pizza = new PepperoniPizza();
        }else if(StringUtils.equals(type, "clam")){
            pizza = new ClamPizza();
        } else if(StringUtils.equals(type, "veggie")){
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
