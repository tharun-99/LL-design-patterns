package DesignPatterns.DecoratorPattern.Beverage;

public abstract class Beverage {
    public String description = "Generic Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
