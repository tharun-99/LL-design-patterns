package DesignPatterns.FactoryMethodPattern.PizzaStore;

import DesignPatterns.FactoryMethodPattern.Pizza.ChicagoStyleCheesePizza;
import DesignPatterns.FactoryMethodPattern.Pizza.ChicagoStyleVeggiePizza;
import DesignPatterns.FactoryMethodPattern.Pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")) return new ChicagoStyleCheesePizza();
        else if(type.equals("veggie")) return new ChicagoStyleVeggiePizza();
        else return null;
    }
}
