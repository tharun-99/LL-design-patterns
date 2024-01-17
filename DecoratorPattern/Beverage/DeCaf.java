package DesignPatterns.DecoratorPattern.Beverage;

public class DeCaf extends Beverage{

    public DeCaf() {
        description = "DeCaf";
    }

    public double cost() {
        return 1.05;
    }
}
