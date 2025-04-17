package com.eight.P06_commandPattern.command;

import com.eight.P06_commandPattern.device.Stereo;

public class StereoOffWithCdCommand implements Command{
    private Stereo stereo;

    public StereoOffWithCdCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        this.stereo.off();
        this.stereo.setVolume(0);
    }
}
