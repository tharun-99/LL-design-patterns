package DesignPatterns.AdapterPattern.Adapter;

import DesignPatterns.AdapterPattern.Duck.Duck;
import DesignPatterns.AdapterPattern.Turkey.Turkey;

public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        // since turkey can only fly short distance
        // we need to make up to duck by flying a few extra times
        for(int i=0; i<5; i++) {
            turkey.fly();
        }
    }
}
