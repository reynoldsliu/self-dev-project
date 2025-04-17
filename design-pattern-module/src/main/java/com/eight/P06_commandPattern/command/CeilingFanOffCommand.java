package com.eight.P06_commandPattern.command;

import com.eight.P06_commandPattern.device.CeilingFan;

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
