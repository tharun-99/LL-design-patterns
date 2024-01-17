package DesignPatterns.DecoratorPattern.Decorator;

import DesignPatterns.DecoratorPattern.Beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public Beverage beverage;

    public abstract String getDescription();
}
