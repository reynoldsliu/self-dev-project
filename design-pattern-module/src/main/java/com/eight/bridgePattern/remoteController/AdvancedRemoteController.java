package com.eight.bridgePattern.remoteController;

import com.eight.bridgePattern.devices.Device;

public class AdvancedRemoteController extends BasicRemoteController {

    public AdvancedRemoteController(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
