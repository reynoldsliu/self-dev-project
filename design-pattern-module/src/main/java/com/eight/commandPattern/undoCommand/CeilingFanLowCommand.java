package com.eight.commandPattern.undoCommand;

import com.eight.commandPattern.device.CeilingFanWithSpeed;

public class CeilingFanLowCommand implements CommandWithUndo {

    private CeilingFanWithSpeed ceilingFanWithSpeed;

    private int prevSpeed;

    public CeilingFanLowCommand(CeilingFanWithSpeed ceilingFanWithSpeed) {
        this.ceilingFanWithSpeed = ceilingFanWithSpeed;
    }

    @Override
    public void execute() {
        this.prevSpeed = ceilingFanWithSpeed.getSpeed();
        this.ceilingFanWithSpeed.low();
    }

    @Override
    public void undo() {
        if (this.prevSpeed == CeilingFanWithSpeed.HIGH) {
            ceilingFanWithSpeed.high();
        } else if (this.prevSpeed == CeilingFanWithSpeed.MEDIUM) {
            ceilingFanWithSpeed.medium();
        } else if (this.prevSpeed == CeilingFanWithSpeed.LOW) {
            ceilingFanWithSpeed.low();
        } else if (this.prevSpeed == CeilingFanWithSpeed.OFF) {
            ceilingFanWithSpeed.off();
        }

    }
}
