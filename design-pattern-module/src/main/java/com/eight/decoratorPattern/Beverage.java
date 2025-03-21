package com.eight.decoratorPattern;

import lombok.Data;

import java.util.List;

@Data
public abstract class Beverage {

    private List<String> description;

    public abstract double cost();
}
