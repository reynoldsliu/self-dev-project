package com.eight.P10_iteratorAndCompositionPattern.CompositionPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent{
    ArrayList menuComponents =  new ArrayList<>();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        this.menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        this.menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return (MenuComponent) menuComponents.get(i);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public void print() {
        System.out.print("\n" +this.getName());
        System.out.println(", "+this.getDescription());
        System.out.println("--------------------");

        Iterator iterator = this.menuComponents.iterator();
        while (iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }
    }

    @Override
    public Iterator createIterator(){
        return new CompositeIterator(this.menuComponents.iterator());
    }
}
