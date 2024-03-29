package DesignPatterns.StrategyPattern.Ducks;

import DesignPatterns.StrategyPattern.FlyBehaviors.FlyBehavior;
import DesignPatterns.StrategyPattern.QuackBehaviors.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {}
    public abstract void display();

    public void performFly() { flyBehavior.fly(); }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) { this.quackBehavior = qb; }

    public void swim() {
        System.out.println("All duck can swim... even decoys!");
    }
}
