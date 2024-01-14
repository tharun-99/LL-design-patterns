package DesignPatterns.StrategyPattern.Ducks;

import DesignPatterns.StrategyPattern.FlyBehaviors.FlyNoWay;
import DesignPatterns.StrategyPattern.QuackBehaviors.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
