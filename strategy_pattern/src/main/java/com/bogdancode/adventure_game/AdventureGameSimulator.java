package com.bogdancode.adventure_game;

public class AdventureGameSimulator {

    public static void main(String[] args) {
        System.out.println(".......Queen.....");
        Character queen = new Queen();
        queen.fight();
        queen.setWeapon(new BowAndArrowBehavior());
        queen.fight();
        System.out.println(".......King.....");
        Character king = new King();
        king.fight();
        king.setWeapon(new KnifeBehavior());
        king.fight();

    }
}
