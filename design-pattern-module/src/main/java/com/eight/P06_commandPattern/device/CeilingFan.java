package com.eight.P06_commandPattern.device;

public class CeilingFan {
    String name;

    public CeilingFan(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " Ceiling on.");
    }

    public void off() {
        System.out.println(name + " Ceiling off.");
    }
}
