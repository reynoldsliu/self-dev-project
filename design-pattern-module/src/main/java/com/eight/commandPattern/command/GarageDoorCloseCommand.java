package com.eight.commandPattern.command;

import com.eight.commandPattern.device.GarageDoor;

public class GarageDoorCloseCommand implements Command{

    private GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        this.garageDoor.close();
    }
}
