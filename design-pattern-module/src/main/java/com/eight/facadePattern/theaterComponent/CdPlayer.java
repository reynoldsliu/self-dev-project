package com.eight.facadePattern.theaterComponent;

public class CdPlayer {
    Amplifier amplifier;
    public void on(){
        System.out.println("CD Player on.");
    }
    public void off(){
        System.out.println("CD Player off.");
    }
}
