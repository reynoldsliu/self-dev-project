package com.eight.templateMethodPattern;

import java.applet.Applet;
import java.awt.*;

public class MyApplet extends Applet {
    String message;

    public void init() {
        this.message = "Hello World!";
        this.repaint();
    }

    public void start() {
        message = "Starting up...";
        this.repaint();
    }

    public void stop() {
        message = "Stopping...";
        this.repaint();
    }

    public void destroy() {
    }

    public void paint(Graphics g) {
        g.drawString(this.message, 5, 15);
    }
}
