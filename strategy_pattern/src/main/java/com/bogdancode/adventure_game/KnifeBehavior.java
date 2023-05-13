package com.bogdancode.adventure_game;

public class KnifeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("use a knife");
    }
}
