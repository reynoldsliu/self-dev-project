package com.eight.P06_commandPattern.undoCommand;

import com.eight.P06_commandPattern.device.CeilingFanWithSpeed;

public class CeilingFanMediumCommand implements CommandWithUndo {

    private CeilingFanWithSpeed ceilingFanWithSpeed;

    private int prevSpeed;

    public CeilingFanMediumCommand(CeilingFanWithSpeed ceilingFanWithSpeed) {
        this.ceilingFanWithSpeed = ceilingFanWithSpeed;
    }

    @Override
    public void execute() {
        this.prevSpeed = ceilingFanWithSpeed.getSpeed();
        this.ceilingFanWithSpeed.medium();
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
