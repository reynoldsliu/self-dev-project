package com.eight.P01_strategyPattern;

public class AxeBehavior implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("use axe to chop");
    }
}
