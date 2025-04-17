package com.eight.P04_factoryPattern.factoryMethodPattern.Store;

import com.eight.P04_factoryPattern.factoryMethodPattern.Pizza.CaliforniaStylePizza.CaliforniaStyleCheesePizza;
import com.eight.P04_factoryPattern.factoryMethodPattern.Pizza.CaliforniaStylePizza.CaliforniaStyleClamPizza;
import com.eight.P04_factoryPattern.factoryMethodPattern.Pizza.CaliforniaStylePizza.CaliforniaStylePepperoniPizza;
import com.eight.P04_factoryPattern.factoryMethodPattern.Pizza.CaliforniaStylePizza.CaliforniaStyleVeggiePizza;
import com.eight.P04_factoryPattern.factoryMethodPattern.Pizza.Pizza;
import org.apache.commons.lang3.StringUtils;

public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        if(StringUtils.equals(item, "cheese")){
            return new CaliforniaStyleCheesePizza();
        }else if (StringUtils.equals(item, "veggie")){
            return new CaliforniaStyleVeggiePizza();
        }else if (StringUtils.equals(item, "clam")){
            return new CaliforniaStyleClamPizza();
        }else if (StringUtils.equals(item, "pepperoni")){
            return new CaliforniaStylePepperoniPizza();
        }
        return null;
    }
}
