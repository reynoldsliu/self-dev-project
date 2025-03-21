package com.eight.factoryPattern.factoryMethodPattern.Pizza.NYStylePizza;

import com.eight.factoryPattern.factoryMethodPattern.Pizza.Pizza;

public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        setName("NY Style Sauce and Cheese Pizza");
        setDough("Thin Crust Dough");
        setSauce("Marinara Sauce");
        addTopping("Grated Reggiano Cheese");
    }
}
