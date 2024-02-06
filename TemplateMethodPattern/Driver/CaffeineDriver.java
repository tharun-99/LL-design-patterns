package DesignPatterns.TemplateMethodPattern.Driver;

import DesignPatterns.TemplateMethodPattern.Concretes.Coffee;
import DesignPatterns.TemplateMethodPattern.Concretes.Tea;

public class CaffeineDriver {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("-------PREPARING TEA-------");
        tea.prepareRecipe();

        System.out.println("-------PREPARING COFFEE-------");
        coffee.prepareRecipe();
    }
}
