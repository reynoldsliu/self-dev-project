package com.eight.P06_commandPattern.control;

import com.eight.P06_commandPattern.undoCommand.CommandWithUndo;
import com.eight.P06_commandPattern.undoCommand.NoCommandWithUndo;

public class RemoteControlWithUndo {

    CommandWithUndo[] onCommands;
    CommandWithUndo[] offCommands;
    CommandWithUndo undoCommand;

    public RemoteControlWithUndo() {
        this.onCommands = new CommandWithUndo[7];
        this.offCommands = new CommandWithUndo[7];
        CommandWithUndo noCommand = new NoCommandWithUndo();
        for (int i = 0; i < 7; i++) {
            this.onCommands[i] = noCommand;
            this.offCommands[i] = noCommand;
        }
        this.undoCommand = noCommand;
    }

    public void setCommands(int slot, CommandWithUndo onCommand, CommandWithUndo offCommand) {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        this.onCommands[slot].execute();
        this.undoCommand = this.onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        this.offCommands[slot].execute();
        this.undoCommand = this.offCommands[slot];
    }

    public void undoButtonWasPushed(){
        this.undoCommand.undo();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n------ Remote Control ------\n");
        for (int i = 0; i < this.onCommands.length; i++) {
            stringBuffer.append("[slot " + i + "]"
                    + this.onCommands[i].getClass().getName() + "  "
                    + this.offCommands[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }
}
