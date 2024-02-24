package DesignPatterns.StatePattern.States;

import DesignPatterns.StatePattern.Context.GumballMachine;

import java.util.Random;

public class HasQuarterState implements State {
    Random randomWinner = new Random(System.currentTimeMillis());
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Cannot insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned the crank");
        int winner = randomWinner.nextInt(10);
        if(winner == 0 && gumballMachine.getCount() > 1) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        }
        else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
