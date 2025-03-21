package com.eight.strategyPattern;

public class AxeBehavior implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("use axe to chop");
    }
}
