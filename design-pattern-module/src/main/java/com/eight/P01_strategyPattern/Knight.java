package com.eight.P01_strategyPattern;

public class Knight extends Character {

    WeaponBehavior weapon = new SwordBehavior();

    @Override
    void fight() {
        this.weapon.useWeapon();
    }
}
