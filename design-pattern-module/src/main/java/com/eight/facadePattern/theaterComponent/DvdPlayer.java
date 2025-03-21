package com.eight.facadePattern.theaterComponent;

public class DvdPlayer {
    Amplifier amplifier;
    public void on(){
        System.out.println("DVD Player on.");
    }
    public void off(){
        System.out.println("DVD Player off.");
    }
    public void play(Movie movie){
        System.out.println("Playing movie "+movie.toString());
    }
    public void stop(){
        System.out.println("DVD Player stop.");
    }
    public void eject(){
        System.out.println("DVD ejected.");
    }
    public String toString(){
        return "DVD Player";
    }
}
