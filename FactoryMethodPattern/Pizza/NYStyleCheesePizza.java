package DesignPatterns.FactoryMethodPattern.Pizza;

public class NYStyleCheesePizza extends Pizza{

    public NYStyleCheesePizza() {
        name = "NY Style Cheese and sauce Pizza";
        dough = "Thin crust dough";
        sauce = "Marinara sauce";

        toppings.add("Grated Reggiano cheese");
    }

    @Override
    public void box() {
        System.out.println("Placing the pizza in official NYStore box");
    }
}
