package com.bogdancode.duck_simulator.behaviors.sound;

public class MuteQuack implements QuackBehavior {

    public void quack() {
        System.out.println("<< Silence >>");
    }
}
