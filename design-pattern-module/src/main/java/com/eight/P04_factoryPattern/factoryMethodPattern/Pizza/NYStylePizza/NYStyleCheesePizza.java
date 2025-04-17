package com.eight.P04_factoryPattern.factoryMethodPattern.Pizza.NYStylePizza;

import com.eight.P04_factoryPattern.factoryMethodPattern.Pizza.Pizza;

public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        setName("NY Style Sauce and Cheese Pizza");
        setDough("Thin Crust Dough");
        setSauce("Marinara Sauce");
        addTopping("Grated Reggiano Cheese");
    }
}
