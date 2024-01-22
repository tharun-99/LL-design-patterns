package DesignPatterns.FactoryMethodPattern.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza{
    public ChicagoStyleVeggiePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Freshly cut Chicago veggies");
    }

    @Override
    public void bake() {
        System.out.println("Bake for 30 minutes at 350F");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }

    @Override
    public void box() {
        System.out.println("Placing pizza in official ChicagoStore box");
    }
}
