package DesignPatterns.FactoryMethodPattern.Pizza;

public class NYStyleVeggiePizza extends Pizza{
    public NYStyleVeggiePizza() {
        name = "NY Style Veggie and sauce Pizza";
        dough = "Thin crust dough";
        sauce = "Marinara sauce";

        toppings.add("Grated Reggiano cheese");
        toppings.add("Freshly cut veggies");
    }

    @Override
    public void box() {
        System.out.println("Placing the pizza in official NYStore box");
    }
}
