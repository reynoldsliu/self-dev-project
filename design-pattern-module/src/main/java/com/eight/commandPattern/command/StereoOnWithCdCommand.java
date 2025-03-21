package com.eight.commandPattern.command;

import com.eight.commandPattern.device.Stereo;

public class StereoOnWithCdCommand implements Command{
    Stereo stereo;

    public StereoOnWithCdCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
