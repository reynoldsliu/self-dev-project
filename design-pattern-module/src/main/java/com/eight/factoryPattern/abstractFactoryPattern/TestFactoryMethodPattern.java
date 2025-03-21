package com.eight.factoryPattern.abstractFactoryPattern;


import com.eight.factoryPattern.abstractFactoryPattern.Pizza.Pizza;
import com.eight.factoryPattern.abstractFactoryPattern.PizzaStore.ChicagoPizzaStore;
import com.eight.factoryPattern.abstractFactoryPattern.PizzaStore.NYPizzaStore;
import com.eight.factoryPattern.abstractFactoryPattern.PizzaStore.PizzaStore;
import org.junit.Test;

public class TestFactoryMethodPattern {

    @Test
    public void test(){
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("veggie");
        System.out.println("Ethan ordered a " + pizza.getName());
        System.out.println(pizza.toString() + "\n");
        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Joel ordered a " + pizza.getName());
        System.out.println(pizza.toString() + "\n");
    }

}
