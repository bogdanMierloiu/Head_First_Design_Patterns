package com.bogdancode.duck_simulator.ducks;

import com.bogdancode.duck_simulator.behaviors.fly.FlyWithWings;
import com.bogdancode.duck_simulator.behaviors.sound.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("I'm a real Mallard duck");
    }

}
