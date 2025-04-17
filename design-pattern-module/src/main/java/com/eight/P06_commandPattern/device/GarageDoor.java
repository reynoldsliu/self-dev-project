package com.eight.P06_commandPattern.device;

public class GarageDoor {
    String name;

    public GarageDoor(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println(name + " GarageDoor open.");
    }

    public void close() {
        System.out.println(name + " GarageDoor close.");
    }
}
