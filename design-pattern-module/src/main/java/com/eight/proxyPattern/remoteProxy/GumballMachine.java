package com.eight.proxyPattern.remoteProxy;

import com.eight.proxyPattern.remoteProxy.state.*;
import lombok.Getter;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

@Getter
public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    State state = soldOutState;
    String location;
    int gumballsNum = 0;

    public GumballMachine(String location, int gumballsNum) throws RemoteException {
        super();
        this.location = location;
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

    @Override
    public int getCount() throws RemoteException {
        return this.gumballsNum;
    }

    @Override
    public String getLocation() throws RemoteException {
        return this.location;
    }

    @Override
    public State getState() throws RemoteException {
        return this.state;
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
