package com.eight.strategyPattern;

public class Knight extends Character {

    WeaponBehavior weapon = new SwordBehavior();

    @Override
    void fight() {
        this.weapon.useWeapon();
    }
}
