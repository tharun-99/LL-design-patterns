package DesignPatterns.DecoratorPattern.Decorator;

import DesignPatterns.DecoratorPattern.Beverage.Beverage;

public class Mocha extends CondimentDecorator{

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " ,Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
