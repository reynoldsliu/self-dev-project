package com.eight.P10_iteratorAndCompositionPattern;

import com.eight.P10_iteratorAndCompositionPattern.withoutIterator.DinerMenu;
import com.eight.P10_iteratorAndCompositionPattern.withoutIterator.PancakeHouseMenu;
import com.eight.P10_iteratorAndCompositionPattern.withoutIterator.Waitress;
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
