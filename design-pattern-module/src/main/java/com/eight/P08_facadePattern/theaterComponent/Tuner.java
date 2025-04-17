package com.eight.P08_facadePattern.theaterComponent;

public class Tuner {
    Amplifier amplifier;
    public void on(){
        System.out.println("Tuner on.");
    }
    public void off(){
        System.out.println("Tuner off.");
    }

    public void setAm(){}
    public void setFm(){}
    public void setFrequency(){}
    public String toString(){
        return "Tuner";
    }
}
