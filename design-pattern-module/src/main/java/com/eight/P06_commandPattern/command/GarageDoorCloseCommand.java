package com.eight.P06_commandPattern.command;

import com.eight.P06_commandPattern.device.GarageDoor;

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
