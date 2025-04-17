package com.eight.P01_strategyPattern;

public class King extends Character {

    WeaponBehavior weapon = new AxeBehavior();

    @Override
    void fight() {
        this.weapon.useWeapon();
    }
}
