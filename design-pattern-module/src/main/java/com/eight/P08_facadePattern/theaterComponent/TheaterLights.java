package com.eight.P08_facadePattern.theaterComponent;

public class TheaterLights {
    private int lightStrength;

    public void on() {
        System.out.println("Lights on.");
    }

    public void off() {
        System.out.println("Lights off.");
    }

    public void dim(int lightStrength) {
        this.lightStrength = lightStrength;
        System.out.println("Lights strength set to " + this.lightStrength + ".");
    }
}
