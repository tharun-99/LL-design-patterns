package DesignPatterns.TemplateMethodPattern.Concretes;

import DesignPatterns.TemplateMethodPattern.Templates.CaffeineBeverageWithHook;

import java.util.Scanner;

public class TeaWithHook extends CaffeineBeverageWithHook {
    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }

    @Override
    public boolean customerWantsCondiments() {
        String ans = getUserInput();
        return ans.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to add Lemon (y/n)? ");
        return sc.nextLine();
    }
}
