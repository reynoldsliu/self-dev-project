package com.eight.P10_iteratorAndCompositionPattern.withoutIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {

    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu){
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenuWithIterator(){
        // origin
        Iterator pancakeIterator = this.pancakeHouseMenu.createIterator();
        Iterator dinerIterator = this.dinerMenu.createIterator();

        System.out.println("MENU\n----\nBREAKFAST");
        this.printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        this.printMenu(dinerIterator);
    }

    public void printMenu(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }

    public void printMenuOrigin() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        ArrayList breakfastItems = pancakeHouseMenu.getMenuItems();

        DinerMenu dinerMenu = new DinerMenu();
        MenuItem[] lunchItems = dinerMenu.getMenuItems();

        for (int i = 0; i < breakfastItems.size(); i++) {
            MenuItem menuItem = (MenuItem) breakfastItems.get(i);
            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription());
        }

        for (int i = 0; i < lunchItems.length; i++) {
            MenuItem menuItem = lunchItems[i];
            if(menuItem == null)continue;
            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription());
        }
    }

    public void printBreakfastMenu() {
    }

    public void printLunchMenu() {
    }

    public void printVegetarianMenu() {
    }

    public boolean isItemVegetarian(MenuItem menuItem) {
        return menuItem.isVegetarian();
    }
}
