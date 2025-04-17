package com.eight.P11_statePattern.state;

import com.eight.P11_statePattern.GumballMachine;

public class WinnerState implements State {

    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Winner insert quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Winner eject quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("Winner turned crank");
    }

    @Override
    public void dispense() {
        System.out.println("YOU'RE A WINNER! You got one extra gumball!");
        this.gumballMachine.releaseBall();
        if(this.gumballMachine.getGumballsNum()==0){
            this.gumballMachine.setState(this.gumballMachine.getSoldOutState());
        }else{
            this.gumballMachine.releaseBall();
            if(this.gumballMachine.getGumballsNum()>0){
                this.gumballMachine.setState(this.gumballMachine.getNoQuarterState());
            }else{
                System.out.println("Oops, out of gumballs!");
                this.gumballMachine.setState(this.gumballMachine.getSoldOutState());
            }
        }
    }
}
