package DesignPatterns.StrategyPattern.Ducks;

import DesignPatterns.StrategyPattern.FlyBehaviors.FlyWithWings;
import DesignPatterns.StrategyPattern.QuackBehaviors.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard Duck");
    }
}
