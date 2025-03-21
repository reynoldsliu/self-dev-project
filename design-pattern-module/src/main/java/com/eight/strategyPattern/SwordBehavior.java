package com.eight.strategyPattern;

public class SwordBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("use sword to slash");
    }
}
