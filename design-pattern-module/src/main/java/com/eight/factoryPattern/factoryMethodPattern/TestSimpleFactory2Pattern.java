package com.eight.factoryPattern.factoryMethodPattern;

import com.eight.factoryPattern.factoryMethodPattern.Pizza.Pizza;
import com.eight.factoryPattern.factoryMethodPattern.Store.ChicagoPizzaStore;
import com.eight.factoryPattern.factoryMethodPattern.Store.NYPizzaStore;
import com.eight.factoryPattern.factoryMethodPattern.Store.PizzaStore;
import org.junit.Test;

public class TestSimpleFactory2Pattern {

    // Creator == Store
    // Factory is in instance of Store like NYPizzaStore
    @Test
    public void test(){
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }

}
