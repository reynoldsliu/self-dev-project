package com.eight.P10_iteratorAndCompositionPattern;

import com.eight.P10_iteratorAndCompositionPattern.CompositionPattern.Menu;
import com.eight.P10_iteratorAndCompositionPattern.CompositionPattern.MenuComponent;
import com.eight.P10_iteratorAndCompositionPattern.CompositionPattern.MenuItem;
import com.eight.P10_iteratorAndCompositionPattern.CompositionPattern.Waitress;
import org.junit.Test;

public class TestCompositionPattern {

    @Test
    public void test(){
        MenuComponent pancakeHouseMenu =
                new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu =
                new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu =
                new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu =
                new Menu("DESSERT MENU", "Dessert of course!");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        // 在这里加入菜单项

        dinerMenu.add(new MenuItem(
                "Pasta",
                "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
                true,
                3.89));

        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem(
                "Apple Pie",
                "Apple pie with a flakey crust, topped with vanilla ice cream",
                true,
                1.59));

        // 在这里加入更多菜单项

        Waitress waitress = new Waitress(allMenus);

        waitress.printMenu();
        waitress.printVegetarianMenu();
    }
}
