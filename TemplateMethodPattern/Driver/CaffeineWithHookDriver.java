package DesignPatterns.TemplateMethodPattern.Driver;

import DesignPatterns.TemplateMethodPattern.Concretes.CoffeeWithHook;
import DesignPatterns.TemplateMethodPattern.Concretes.TeaWithHook;

public class CaffeineWithHookDriver {
    public static void main(String[] args) {
        TeaWithHook teaWithHook = new TeaWithHook();
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();

        System.out.println("------PREPARING TEA WITH HOOK---------");
        teaWithHook.prepareRecipe();

        System.out.println("------PREPARING COFFEE WITH HOOK--------");
        coffeeWithHook.prepareRecipe();
    }
}
