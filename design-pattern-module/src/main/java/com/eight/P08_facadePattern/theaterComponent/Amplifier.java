package com.eight.P08_facadePattern.theaterComponent;

public class Amplifier {
    Tuner tuner;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;
    private int volume;

    public void on() {
        System.out.println("Amplifier on.");
    }

    public void off() {
        System.out.println("Amplifier off.");
    }

    public void setSurroundSound(){
        System.out.println("Amplifier set to Surround-Sound mode.");
    }

    public void setVolume(int volume){
        this.volume = volume;
        System.out.println("Amplifier set to volume "+this.volume+".");
    }

    public Tuner getTuner() {
        return tuner;
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }

    public DvdPlayer getDvdPlayer() {
        return dvdPlayer;
    }

    public void setDvdPlayer(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }

    public CdPlayer getCdPlayer() {
        return cdPlayer;
    }

    public void setCdPlayer(CdPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
    }

    public String toString() {
        return this.tuner.toString() + "/" + this.dvdPlayer.toString() + "/" + this.cdPlayer.toString();
    }
}
