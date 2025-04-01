package com.eight.iteratorAndCompositionPattern;

import com.eight.iteratorAndCompositionPattern.withoutIterator.DinerMenu;
import com.eight.iteratorAndCompositionPattern.withoutIterator.PancakeHouseMenu;
import com.eight.iteratorAndCompositionPattern.withoutIterator.Waitress;
import org.junit.Test;

public class TestIteratorPattern {

    @Test
    public void test(){
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        System.out.println("Origin print");
        waitress.printMenuOrigin();
        System.out.println();
        System.out.println("Iterator print");
        waitress.printMenuWithIterator();
    }
}
