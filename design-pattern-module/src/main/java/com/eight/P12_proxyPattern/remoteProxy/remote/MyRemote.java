package com.eight.P12_proxyPattern.remoteProxy.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemote extends Remote {
    public String sayHello() throws RemoteException;
}
