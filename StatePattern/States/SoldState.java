package DesignPatterns.StatePattern.States;

import DesignPatterns.StatePattern.Context.GumballMachine;

public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait! we are giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You already turned the crank buddy");
    }

    @Override
    public void turnCrank() {
        System.out.println("You think turning twice gives you extra gumball :)");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseGumball();
        if(gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }
        else {
            System.out.println("Oops!! Out of gumballs");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
