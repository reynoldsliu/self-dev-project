package com.eight.P04_factoryPattern.simpleFactoryPattern;

import com.eight.P04_factoryPattern.simpleFactoryPattern.Factory.ChicagoPizzaFactory;
import com.eight.P04_factoryPattern.simpleFactoryPattern.Factory.NYPizzaFactory;
import org.junit.Test;

public class TestSimpleFactoryPattern {

    @Test
    public void test(){
        NYPizzaFactory nyFactory = new NYPizzaFactory();
        PizzaStore nyStore = new PizzaStore(nyFactory);
        nyStore.orderPizza("Veggie");

        ChicagoPizzaFactory chicagoFactory = new ChicagoPizzaFactory();
        PizzaStore chicagoStore = new PizzaStore(chicagoFactory);
        chicagoStore.orderPizza("Veggie");
    }

}
