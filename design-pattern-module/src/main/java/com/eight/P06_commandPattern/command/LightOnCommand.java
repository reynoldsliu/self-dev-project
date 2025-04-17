package com.eight.P06_commandPattern.command;

import com.eight.P06_commandPattern.device.Light;

public class LightOnCommand implements Command{

    private Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.on();
    }
}
