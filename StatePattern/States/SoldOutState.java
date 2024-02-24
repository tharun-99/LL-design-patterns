package DesignPatterns.StatePattern.States;

import DesignPatterns.StatePattern.Context.GumballMachine;

public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("No gumballs to insert the quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("No quarter inserted");
    }

    @Override
    public void turnCrank() {
        System.out.println("Cannot turn the crank, out of stock");
    }

    @Override
    public void dispense() {
        System.out.println("Cannot dispense without the stock");
    }
}
