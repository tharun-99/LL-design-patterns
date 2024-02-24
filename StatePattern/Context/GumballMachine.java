package DesignPatterns.StatePattern.Context;

import DesignPatterns.StatePattern.States.*;

public class GumballMachine {
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State soldOutState;
    State winnerState;

    State state;
    int count;

    public GumballMachine(int numberOfGumballs) {
        this.count = numberOfGumballs;
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        winnerState = new WinnerState(this);

        if(this.count > 0) {
            this.state = noQuarterState;
        }
        else {
            this.state = soldOutState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void releaseGumball() {
        System.out.println("Gumball comes rolling out!!");
        this.count--;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        return this.count;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    @Override
    public String toString() {
        String out = "";
        out += "\nMighty Gumball, Inc.\nJava-enabled Standing Gumball Model #2024\n";
        out += "Inventory: " + this.count + " gumballs\n";
        if(state == noQuarterState) out += "Machine is waiting for quarter\n";
        else if(state == soldOutState) out += "Machine is sold out\n";
        out += "-------------------------------\n";

        return out;
    }
}
