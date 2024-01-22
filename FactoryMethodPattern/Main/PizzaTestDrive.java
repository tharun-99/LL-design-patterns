package DesignPatterns.FactoryMethodPattern.Main;

import DesignPatterns.FactoryMethodPattern.Pizza.Pizza;
import DesignPatterns.FactoryMethodPattern.PizzaStore.ChicagoPizzaStore;
import DesignPatterns.FactoryMethodPattern.PizzaStore.NYPizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza nyPizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + nyPizza.getName());

        System.out.println();
        Pizza chicPizaa = chicagoPizzaStore.orderPizza("veggie");
        System.out.println("Joel ordered a " + chicPizaa.getName());
    }
}
