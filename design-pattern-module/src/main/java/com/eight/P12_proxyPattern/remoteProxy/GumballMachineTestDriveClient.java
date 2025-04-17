package com.eight.P12_proxyPattern.remoteProxy;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class GumballMachineTestDriveClient {
    public static void main(String[] args) {
        GumballMachineRemote gumballMachine = null;
        int count;

//        if (args.length < 2) {
//            System.out.println("GumballMachine <name> <inventory>");
//            System.exit(1);
//        }

        try {
            // Get the registry
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            // Look up the remote object
            gumballMachine = (GumballMachineRemote) registry.lookup("//" + "Taipei" + "/gumballMachine"+"aLocation");

            // Call the remote method
            count = gumballMachine.getCount();
            String location = gumballMachine.getLocation();
            System.out.println("Response: " + location + ", count = " + count);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        } catch (NotBoundException e) {
            throw new RuntimeException(e);
        }
    }
}
