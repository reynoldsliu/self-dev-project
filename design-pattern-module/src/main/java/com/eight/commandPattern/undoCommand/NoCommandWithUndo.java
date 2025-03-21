package com.eight.commandPattern.undoCommand;

import com.eight.commandPattern.command.Command;

public class NoCommandWithUndo implements CommandWithUndo {
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
