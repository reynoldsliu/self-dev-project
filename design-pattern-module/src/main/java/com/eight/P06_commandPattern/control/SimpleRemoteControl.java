package com.eight.P06_commandPattern.control;

import com.eight.P06_commandPattern.command.Command;

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
