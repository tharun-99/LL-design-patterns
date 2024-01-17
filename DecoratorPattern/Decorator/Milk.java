package DesignPatterns.DecoratorPattern.Decorator;

import DesignPatterns.DecoratorPattern.Beverage.Beverage;

public class Milk extends CondimentDecorator{

    public Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " ,Milk";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }

}
