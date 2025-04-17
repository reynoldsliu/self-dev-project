package com.eight.P06_commandPattern.command;

import com.eight.P06_commandPattern.device.GarageDoor;

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
