package com.eight.P12_proxyPattern.remoteProxy;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class GumballMachineTestDrive {
    public static void main(String[] args) {

//        if (args.length < 2) {
//            System.out.println("GumballMachine <name> <inventory>");
//            System.exit(1);
//        }

        try {
            int count = Integer.parseInt("5");
            GumballMachineRemote gumballMachine1 = new GumballMachine("Taipei", count);
            GumballMachineRemote gumballMachine2 = new GumballMachine("Taichung", count*5);
            GumballMachineRemote gumballMachine3 = new GumballMachine("Tainan", count+7);

            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("//" + "Taipei" + "/gumballMachine"+"aLocation", gumballMachine1);
            registry.rebind("//" + "Taipei" + "/gumballMachine"+"bLocation", gumballMachine2);
            registry.rebind("//" + "Taipei" + "/gumballMachine"+"cLocation", gumballMachine3);

        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
