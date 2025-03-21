package com.eight.commandPattern;

import com.eight.commandPattern.command.*;
import com.eight.commandPattern.control.RemoteControl;
import com.eight.commandPattern.control.RemoteControlWithUndo;
import com.eight.commandPattern.control.SimpleRemoteControl;
import com.eight.commandPattern.device.*;
import com.eight.commandPattern.undoCommand.CeilingFanHighCommand;
import com.eight.commandPattern.undoCommand.CeilingFanLowCommand;
import com.eight.commandPattern.undoCommand.CeilingFanMediumCommand;
import org.junit.Test;

public class TestCommandPattern {

    @Test
    public void test(){
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light("");
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        GarageDoor garageDoor = new GarageDoor("");
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);

        simpleRemoteControl.setCommand(lightOnCommand);
        simpleRemoteControl.buttonWasPressed();
        simpleRemoteControl.setCommand(garageDoorOpenCommand);
        simpleRemoteControl.buttonWasPressed();
    }

    @Test
    public void test2(){
        RemoteControl remoteControl = new RemoteControl();
        Light livingroomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingroomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingroomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(livingroomLight);

        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garageDoor);

        StereoOnWithCdCommand stereoOnWithCd = new StereoOnWithCdCommand(stereo);
        StereoOffWithCdCommand stereoOffWithCd = new StereoOffWithCdCommand(stereo);

        remoteControl.setCommands(0,livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommands(1,kitchenLightOn,kitchenLightOff);
        remoteControl.setCommands(2,ceilingFanOn, ceilingFanOff);
        remoteControl.setCommands(3,stereoOnWithCd, stereoOffWithCd);
        remoteControl.setCommands(4, garageDoorOpen, garageDoorClose);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);
    }

    @Test
    public void testUndo(){
        RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();

        CeilingFanWithSpeed ceilingFanWithSpeed = new CeilingFanWithSpeed("Living Room");

        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFanWithSpeed);
        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFanWithSpeed);
        CeilingFanLowCommand ceilingFanLowCommand = new CeilingFanLowCommand(ceilingFanWithSpeed);
        com.eight.commandPattern.undoCommand.CeilingFanOffCommand ceilingFanOffCommand = new com.eight.commandPattern.undoCommand.CeilingFanOffCommand(ceilingFanWithSpeed);

        remoteControlWithUndo.setCommands(0,ceilingFanMediumCommand, ceilingFanOffCommand);
        remoteControlWithUndo.setCommands(1,ceilingFanHighCommand,ceilingFanOffCommand);

        remoteControlWithUndo.onButtonWasPushed(0);
        remoteControlWithUndo.offButtonWasPushed(0);
        System.out.println(remoteControlWithUndo);
        remoteControlWithUndo.undoButtonWasPushed();

        remoteControlWithUndo.onButtonWasPushed(1);
        System.out.println(remoteControlWithUndo);
        remoteControlWithUndo.undoButtonWasPushed();
    }
}
