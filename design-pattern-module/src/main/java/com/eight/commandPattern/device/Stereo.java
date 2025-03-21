package com.eight.commandPattern.device;

public class Stereo {
    int volume;
    String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " Stereo on.");
    }

    public void off() {
        System.out.println(name + " Stereo off.");
    }

    public void setCD() {
        System.out.println(name + " Stereo CD set.");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println(name + " Stereo volume is set to " + this.volume + ".");
    }
}
