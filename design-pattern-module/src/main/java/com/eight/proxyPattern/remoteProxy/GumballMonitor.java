package com.eight.proxyPattern.remoteProxy;

import java.rmi.RemoteException;

public class GumballMonitor {
    GumballMachineRemote gumballMachine;

    public GumballMonitor(GumballMachineRemote gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report() {
        try {
            System.out.println("Gumball Machine: " + this.gumballMachine.getLocation());
            System.out.println("Current Inventory: " + this.gumballMachine.getCount() + " gumballs.");
            System.out.println("Current state: " + this.gumballMachine.getState());
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
