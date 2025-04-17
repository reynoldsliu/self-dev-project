package com.eight.P08_facadePattern.theaterComponent;

public class Projector {
    DvdPlayer dvdPlayer;
    public void on(){
        System.out.println("Projector on.");
    }
    public void off(){
        System.out.println("Projector off.");
    }

    public void setInput(DvdPlayer dvdPlayer){
        this.dvdPlayer = dvdPlayer;
        System.out.println("Input is now from " + this.dvdPlayer.toString());
    }

    public void wideScreenMode(){
        System.out.println("Project set to Wide-Screen mode.");
    }
}
