package DesignPatterns.StatePattern.States;

import DesignPatterns.StatePattern.Context.GumballMachine;

public class WinnerState implements State {
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Wait! we are giving you gumballs");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Cannot turn the crank twice!!");
    }

    @Override
    public void dispense() {
        System.out.println("YOU'RE A WINNER!! You get two gumballs for your quarter");
        gumballMachine.releaseGumball();
        if(gumballMachine.getCount() == 0) {
            System.out.println("OOPS!! We ran out of gumballs");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
        else {
            gumballMachine.releaseGumball();
            if(gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            }
            else {
                System.out.println("Ran out of gumballs! please refill");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}
