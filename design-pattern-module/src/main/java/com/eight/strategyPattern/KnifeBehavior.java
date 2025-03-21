package com.eight.strategyPattern;

public class KnifeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("use knife to stab.");
    }
}
