package com.eight.strategyPattern;

public class Troll extends Character {
    WeaponBehavior weapon = new KnifeBehavior();
    @Override
    void fight() {
        this.weapon.useWeapon();
    }
}
