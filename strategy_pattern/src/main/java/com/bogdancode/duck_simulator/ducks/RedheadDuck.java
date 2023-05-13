package com.bogdancode.duck_simulator.ducks;

import com.bogdancode.duck_simulator.behaviors.fly.FlyNoWay;
import com.bogdancode.duck_simulator.behaviors.sound.MuteQuack;

public class RedheadDuck extends Duck {


    public RedheadDuck(){
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    public void display() {
        System.out.println("I'm a red head duck!");
    }


}
