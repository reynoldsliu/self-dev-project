package com.eight.P12_proxyPattern.virtualProxy;

import javax.swing.*;
import java.net.URL;

public class ImageProxyTestDrive {
    ImageComponent imageComponent;
    JFrame frame = new JFrame("CD Cover Viewer");

    public static void main(String[] args) throws Exception {
        ImageProxyTestDrive testDrive = new ImageProxyTestDrive();
    }

    public ImageProxyTestDrive() throws Exception {
        // Create frame and set properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Build menu and icon
        String initialURL = "https://picsum.photos/800/600.jpg"; // Replace with actual URL
        Icon icon = new ImageProxy(new URL(initialURL));
        imageComponent = new ImageComponent(icon);

        // Add component to frame
        frame.getContentPane().add(imageComponent);
        frame.setVisible(true);
    }
}
