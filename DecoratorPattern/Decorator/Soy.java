package DesignPatterns.DecoratorPattern.Decorator;

import DesignPatterns.DecoratorPattern.Beverage.Beverage;

public class Soy extends CondimentDecorator{

    public Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " ,Soy";
    }

    @Override
    public double cost() {
        return 0.15 + beverage.cost();
    }
}
