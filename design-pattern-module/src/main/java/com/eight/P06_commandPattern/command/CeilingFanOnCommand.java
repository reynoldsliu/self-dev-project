package com.eight.P06_commandPattern.command;

import com.eight.P06_commandPattern.device.CeilingFan;

public class CeilingFanOnCommand implements Command{

    private CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        this.ceilingFan.on();
    }
}
