package com.eight.P04_factoryPattern.factoryMethodPattern.Store;

import com.eight.P04_factoryPattern.factoryMethodPattern.Pizza.ChicagoStylePizza.ChicagoStyleCheesePizza;
import com.eight.P04_factoryPattern.factoryMethodPattern.Pizza.ChicagoStylePizza.ChicagoStyleClamPizza;
import com.eight.P04_factoryPattern.factoryMethodPattern.Pizza.ChicagoStylePizza.ChicagoStylePepperoniPizza;
import com.eight.P04_factoryPattern.factoryMethodPattern.Pizza.ChicagoStylePizza.ChicagoStyleVeggiePizza;
import com.eight.P04_factoryPattern.factoryMethodPattern.Pizza.Pizza;
import org.apache.commons.lang3.StringUtils;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        if(StringUtils.equals(item, "cheese")){
            return new ChicagoStyleCheesePizza();
        }else if (StringUtils.equals(item, "veggie")){
            return new ChicagoStyleVeggiePizza();
        }else if (StringUtils.equals(item, "clam")){
            return new ChicagoStyleClamPizza();
        }else if (StringUtils.equals(item, "pepperoni")){
            return new ChicagoStylePepperoniPizza();
        }
        return null;
    }
}
