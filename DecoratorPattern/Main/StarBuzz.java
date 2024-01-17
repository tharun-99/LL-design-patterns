package DesignPatterns.DecoratorPattern.Main;

import DesignPatterns.DecoratorPattern.Beverage.Beverage;
import DesignPatterns.DecoratorPattern.Beverage.DeCaf;
import DesignPatterns.DecoratorPattern.Beverage.Espresso;
import DesignPatterns.DecoratorPattern.Beverage.HouseBlend;
import DesignPatterns.DecoratorPattern.Decorator.Milk;
import DesignPatterns.DecoratorPattern.Decorator.Mocha;
import DesignPatterns.DecoratorPattern.Decorator.Soy;
import DesignPatterns.DecoratorPattern.Decorator.Whip;

public class StarBuzz {
    public static void main(String[] args) {
        // beverage 1
        // normal coffee without any extras
        Beverage bev1 = new Espresso();
        System.out.println(bev1.getDescription() + " will cost : $" + bev1.cost());

        // beverage 2
        // DeCaf with milk, Soy and mocha
        Beverage bev2 = new DeCaf();
        bev2 = new Milk(bev2);
        bev2 = new Soy(bev2);
        bev2 = new Mocha(bev2);
        System.out.println(bev2.getDescription() + " will cost : $" + bev2.cost());

        // beverage 3
        // House blend with soy double mocha and whip
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " will cost : $" + beverage3.cost());

    }
}
