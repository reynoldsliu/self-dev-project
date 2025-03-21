package com.eight.commandPattern.control;

import com.eight.commandPattern.command.Command;

public class SimpleRemoteControl {

    private Command slot;

    public SimpleRemoteControl(){}

    public void setCommand(Command command){
        this.slot = command;
    }

    public void buttonWasPressed(){
        this.slot.execute();
    }
}
