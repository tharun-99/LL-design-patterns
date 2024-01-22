package DesignPatterns.FactoryMethodPattern.Pizza;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings...");
        for(String topping:toppings) {
            System.out.println(" " + topping);
        }
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350F");
    }

    public void cut() {
        System.out.println("Cut the pizza into diagonal pieces");
    }

    public void box() {
        System.out.println("Place the pizza into the official PizzaStore box");
    }

    public String getName() {
        return this.name;
    }
}
