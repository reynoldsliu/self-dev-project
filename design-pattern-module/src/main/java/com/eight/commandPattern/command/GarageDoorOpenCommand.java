package com.eight.commandPattern.command;

import com.eight.commandPattern.device.GarageDoor;

public class GarageDoorOpenCommand implements Command{

    private GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        this.garageDoor.open();
    }
}
