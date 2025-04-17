package com.eight.P06_commandPattern.command;

import com.eight.P06_commandPattern.device.Light;

public class LightOffCommand implements Command{

    private Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
