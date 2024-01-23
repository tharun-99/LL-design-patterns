package DesignPatterns.SingletonPattern.Main;

import DesignPatterns.SingletonPattern.Singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        // both of them will print out same address
        // since both of them are same instances of Singleton class
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
