package DesignPatterns.AdapterPattern.Driver;

import DesignPatterns.AdapterPattern.Adapter.TurkeyAdapter;
import DesignPatterns.AdapterPattern.Duck.Duck;
import DesignPatterns.AdapterPattern.Duck.MallardDuck;
import DesignPatterns.AdapterPattern.Turkey.Turkey;
import DesignPatterns.AdapterPattern.Turkey.WildTurkey;

public class AdapterDriver {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Turkey wildTurkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println(".....Wild Turkey.....");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println(".....Mallard Duck.....");
        testDuck(mallardDuck);

        System.out.println(".....Turkey Adapter as a duck.....");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

}
