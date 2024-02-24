package DesignPatterns.StatePattern.States;

import DesignPatterns.StatePattern.Context.GumballMachine;

public class NoQuarterState implements State{
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("No quarter inserted, so can't eject");
    }

    @Override
    public void turnCrank() {
        System.out.println("First insert a quarter before turning the crank");
    }

    @Override
    public void dispense() {
        System.out.println("Cannot dispense without a quarter");
    }
}
