package com.eight.P01_strategyPattern;

public class Troll extends Character {
    WeaponBehavior weapon = new KnifeBehavior();
    @Override
    void fight() {
        this.weapon.useWeapon();
    }
}
