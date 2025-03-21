package com.eight.commandPattern.command;

import com.eight.commandPattern.device.Light;

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
