package com.eight.strategyPattern;

public class Queen extends Character {

    WeaponBehavior weapon = new BowAndArrowBehavior();

    @Override
    void fight() {
        this.weapon.useWeapon();
    }
}
