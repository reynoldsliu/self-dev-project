package com.eight.P10_iteratorAndCompositionPattern.withoutIterator;

import java.util.Iterator;

public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu(){
        this.menuItems = new MenuItem[MAX_ITEMS];

        this.addItem("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat",
                true,
                2.99);
        this.addItem("BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat",
                true,
                2.99);
        this.addItem("Soup of the Day",
                "Soup of the Day, with a side of potato salad",
                false,
                3.29);
        this.addItem("Hot dog",
                "A hot dog, with saurkraut, relish, onions, topping with cheese",
                false,
                3.05);
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if(this.numberOfItems >= MAX_ITEMS){
            System.out.println("Menu is full.");
        }else{
            this.menuItems[this.numberOfItems] = menuItem;
            this.numberOfItems++;
        }
    }

    public Iterator createIterator(){
        return new DinerMenuIterator(this.menuItems);
    }

    /**
     * will be deprecated after iterator was implemented
     * @return
     */
    public MenuItem[] getMenuItems(){
        return this.menuItems;
    }
}
