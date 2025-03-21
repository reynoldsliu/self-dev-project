package com.eight.strategyPattern;

public class King extends Character {

    WeaponBehavior weapon = new AxeBehavior();

    @Override
    void fight() {
        this.weapon.useWeapon();
    }
}
