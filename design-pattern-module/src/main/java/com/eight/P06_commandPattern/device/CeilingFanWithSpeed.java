package com.eight.P06_commandPattern.device;

public class CeilingFanWithSpeed {
    String name;
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    int speed;

    public CeilingFanWithSpeed(String name) {
        this.name = name;
        this.speed = OFF;
    }

    public void high(){
        this.speed = HIGH;
        System.out.println(name+" Ceiling is high.");
    }

    public void medium(){
        this.speed = MEDIUM;
        System.out.println(name+" Ceiling is medium.");
    }

    public void low(){
        this.speed = LOW;
        System.out.println(name+" Ceiling is low.");
    }

    public void off(){
        this.speed = OFF;
        System.out.println(name+" Ceiling is off.");
    }

    public int getSpeed(){
        return this.speed;
    }
}
