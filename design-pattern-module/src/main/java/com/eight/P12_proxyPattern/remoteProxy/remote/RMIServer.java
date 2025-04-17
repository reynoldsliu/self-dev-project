package com.eight.P12_proxyPattern.remoteProxy.remote;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer {

    public static void main(String[] args) {
        try {
            // Create the remote object
            MyRemoteImpl remoteObj = new MyRemoteImpl();

            // Create or get the registry
            Registry registry = LocateRegistry.createRegistry(1099);

            // Register the remote object with a name
            registry.rebind("RemoteHello", remoteObj);

            System.out.println("RMI Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
