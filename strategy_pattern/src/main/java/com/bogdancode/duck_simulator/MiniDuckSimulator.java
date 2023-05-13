package com.bogdancode.duck_simulator;

import com.bogdancode.duck_simulator.behaviors.fly.FlyRocketPowered;
import com.bogdancode.duck_simulator.behaviors.fly.FlyWithWings;
import com.bogdancode.duck_simulator.behaviors.sound.Quack;
import com.bogdancode.duck_simulator.ducks.Duck;
import com.bogdancode.duck_simulator.ducks.MallardDuck;
import com.bogdancode.duck_simulator.ducks.ModelDuck;
import com.bogdancode.duck_simulator.ducks.RedheadDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        System.out.println("----------------------");

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

        System.out.println("----------------");

        Duck silentDuck = new RedheadDuck();
        silentDuck.performFly();
        silentDuck.performQuack();
        silentDuck.setFlyBehavior(new FlyWithWings());
        silentDuck.setQuackBehavior(new Quack());
        System.out.println("behaviors changed");
        silentDuck.performFly();
        silentDuck.performQuack();
    }
}
