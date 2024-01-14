package DesignPatterns.StrategyPattern.QuackBehaviors;

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}
