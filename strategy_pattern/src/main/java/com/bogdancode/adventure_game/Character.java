package com.bogdancode.adventure_game;

public abstract class Character {

    WeaponBehavior weapon;

    public void setWeapon(WeaponBehavior w) {
        this.weapon = w;
    }

    public void fight() {
        weapon.useWeapon();
    }
}
