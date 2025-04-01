package com.eight.iteratorAndCompositionPattern.withoutIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu {
    ArrayList menuItems;

    public PancakeHouseMenu(){
        menuItems = new ArrayList();

        this.addItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, toast",
                true,2.99);

        this.addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,2.99);

        this.addItem("Blueberry Pancake",
                "Pancakes made with fresh blueberries",
                true,3.49);

        this.addItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true,3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        this.menuItems.add(menuItem);
    }

    public Iterator createIterator(){
//        return new PancakeHouseMenuIterator(this.menuItems);
        return this.menuItems.iterator();
    }

    /**
     * will be deprecated after iterator was implemented
     * @return
     */
    public ArrayList getMenuItems(){
        return this.menuItems;
    }
}
