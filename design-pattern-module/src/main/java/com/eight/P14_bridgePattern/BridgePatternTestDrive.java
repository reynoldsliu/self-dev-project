package com.eight.P14_bridgePattern;

import com.eight.P14_bridgePattern.devices.Device;
import com.eight.P14_bridgePattern.devices.Radio;
import com.eight.P14_bridgePattern.devices.Tv;
import com.eight.P14_bridgePattern.remoteController.AdvancedRemoteController;
import com.eight.P14_bridgePattern.remoteController.BasicRemoteController;

public class BridgePatternTestDrive {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemoteController basicRemote = new BasicRemoteController(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemoteController advancedRemote = new AdvancedRemoteController(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
