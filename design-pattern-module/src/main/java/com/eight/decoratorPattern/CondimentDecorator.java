package com.eight.decoratorPattern;

import java.util.List;

public abstract class CondimentDecorator extends Beverage{
    Beverage beverage;
    public abstract List<String> getDescription();
}
