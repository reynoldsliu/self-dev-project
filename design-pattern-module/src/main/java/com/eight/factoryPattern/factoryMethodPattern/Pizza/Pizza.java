package com.eight.factoryPattern.factoryMethodPattern.Pizza;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    List<String> toppings;

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings:");
        for (String topping : this.toppings) {
            System.out.println(" " + topping);
        }
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place the pizza in official PizzaStore box");
    }

    public List<String> addTopping(String newTopping){
        List<String> toppings = this.toppings;
        if(Objects.isNull(toppings) || toppings.isEmpty()){
            toppings = new ArrayList<>();
        }
        toppings.add(newTopping);
        setToppings(toppings);
        return getToppings();
    }

}
