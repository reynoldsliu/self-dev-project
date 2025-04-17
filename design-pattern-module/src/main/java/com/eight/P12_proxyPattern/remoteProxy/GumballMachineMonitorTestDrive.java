package com.eight.P12_proxyPattern.remoteProxy;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class GumballMachineMonitorTestDrive {
    public static void main(String[] args) {
        String[] locations = {"aLocation", "bLocation", "cLocation"};
        GumballMonitor[] gumballMonitors = new GumballMonitor[locations.length];

        for (int i = 0; i < locations.length; i++) {
            try {
                Registry registry = LocateRegistry.getRegistry("localhost", 1099);

                GumballMachineRemote gumballMachine =
                        (GumballMachineRemote) registry.lookup("//" + "Taipei" + "/gumballMachine"+locations[i]);
                gumballMonitors[i] = new GumballMonitor(gumballMachine);
                System.out.println(gumballMonitors[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < locations.length; i++) {
            gumballMonitors[i].report();
            System.out.println();
        }
    }
}
