package com.eight.P12_proxyPattern.remoteProxy.state;

import com.eight.P12_proxyPattern.remoteProxy.GumballMachine;

import java.util.Random;

public class HasQuarterState implements State {

    Random randomWinner = new Random(System.currentTimeMillis());
    transient GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        this.gumballMachine.setState(this.gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        int winner = this.randomWinner.nextInt(10);
        if ((winner == 0) && (this.gumballMachine.getGumballsNum() > 1)) {
            this.gumballMachine.setState(this.gumballMachine.getWinnerState());
        }
        this.gumballMachine.setState(this.gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public String toString(){
        return "Has Quarter State.";
    }
}
