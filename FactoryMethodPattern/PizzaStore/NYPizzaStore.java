package DesignPatterns.FactoryMethodPattern.PizzaStore;

import DesignPatterns.FactoryMethodPattern.Pizza.NYStyleCheesePizza;
import DesignPatterns.FactoryMethodPattern.Pizza.NYStyleVeggiePizza;
import DesignPatterns.FactoryMethodPattern.Pizza.Pizza;

public class NYPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")) return new NYStyleCheesePizza();
        else if(type.equals("veggie")) return new NYStyleVeggiePizza();
        else return null;
    }
}
