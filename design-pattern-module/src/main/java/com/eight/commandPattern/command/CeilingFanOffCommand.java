package com.eight.commandPattern.command;

import com.eight.commandPattern.device.CeilingFan;

public class CeilingFanOffCommand implements Command{

    private CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        this.ceilingFan.off();
    }
}
