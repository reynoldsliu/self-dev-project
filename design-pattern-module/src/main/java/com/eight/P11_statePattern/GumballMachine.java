package com.eight.P11_statePattern;

import com.eight.P11_statePattern.state.*;
import lombok.Getter;

@Getter
public class GumballMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    State state = soldOutState;
    int gumballsNum = 0;

    public GumballMachine(int gumballsNum) {
        this.soldOutState = new SoldOutState(this);
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldState = new SoldState(this);
        this.winnerState = new WinnerState(this);
        this.gumballsNum = gumballsNum;
        System.out.println(this.gumballsNum);
        if (this.gumballsNum > 0) {
            this.state = noQuarterState;
        }
    }

    public void insertQuarter() {
        this.state.insertQuarter();
    }

    public void ejectQuarter() {
        this.state.ejectQuarter();
    }

    public void turnCrank() {
        this.state.turnCrank();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out of the slot...");
        if (this.gumballsNum > 0) {
            this.gumballsNum = this.gumballsNum - 1;
        }
    }
}
