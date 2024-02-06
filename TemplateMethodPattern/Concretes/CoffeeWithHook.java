package DesignPatterns.TemplateMethodPattern.Concretes;

import DesignPatterns.TemplateMethodPattern.Templates.CaffeineBeverageWithHook;

import java.util.Scanner;

public class CoffeeWithHook extends CaffeineBeverageWithHook {
    @Override
    public void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding milk and sugar");
    }

    @Override
    public boolean customerWantsCondiments() {
        String ans = getUserInput();
        return ans.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to add sugar and milk (y/n)? ");
        return sc.nextLine();
    }
}
