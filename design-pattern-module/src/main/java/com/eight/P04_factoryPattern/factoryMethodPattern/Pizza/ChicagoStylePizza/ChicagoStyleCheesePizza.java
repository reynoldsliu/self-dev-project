package com.eight.P04_factoryPattern.factoryMethodPattern.Pizza.ChicagoStylePizza;

import com.eight.P04_factoryPattern.factoryMethodPattern.Pizza.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza(){
        setName("Chicago Style Deep Dish Cheese Pizza");
        setDough("Extra Thick Crust Dough");
        setSauce("Plum Tomato Sauce");
        addTopping("Shredded Mozzarella Cheese");
    }

    public void cut(){
        System.out.println("Cutting the Pizza into square slices");
    }
}
