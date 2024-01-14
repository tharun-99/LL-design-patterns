package DesignPatterns.StrategyPattern.Main;

import DesignPatterns.StrategyPattern.Ducks.Duck;
import DesignPatterns.StrategyPattern.Ducks.ModelDuck;
import DesignPatterns.StrategyPattern.FlyBehaviors.FlyRocketPowered;
import DesignPatterns.StrategyPattern.QuackBehaviors.MuteQuack;

public class MiniDuckSimulator{
    public static void main(String[] args) {
        Duck duck = new ModelDuck();
        duck.display();
        duck.performQuack();
        duck.performFly();

        duck.setFlyBehavior(new FlyRocketPowered());
        duck.setQuackBehavior(new MuteQuack());
        duck.performFly();
        duck.swim();
    }
}
