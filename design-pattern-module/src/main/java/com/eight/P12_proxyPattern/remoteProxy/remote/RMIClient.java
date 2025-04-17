package com.eight.P12_proxyPattern.remoteProxy.remote;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient {
    public static void main(String[] args) {
        try {
            // Get the registry
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            // Look up the remote object
            MyRemote remoteObj = (MyRemote) registry.lookup("RemoteHello");

            // Call the remote method
            String response = remoteObj.sayHello();
            System.out.println("Response: " + response);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}