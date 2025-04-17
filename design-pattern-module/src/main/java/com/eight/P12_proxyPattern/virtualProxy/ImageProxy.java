package com.eight.P12_proxyPattern.virtualProxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageProxy implements Icon {

    ImageIcon imageIcon;
    URL imageUrl;
    Thread retrievalThread;
    boolean retrieving = false;

    public ImageProxy(URL imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public int getIconWidth() {
        if (this.imageIcon != null) {
            return this.imageIcon.getIconWidth();
        }
        return 800;
    }

    @Override
    public int getIconHeight() {
        if (this.imageIcon != null) {
            return this.imageIcon.getIconHeight();
        }
        return 600;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        if (this.imageIcon != null) {
            imageIcon.paintIcon(c, g, x, y);
        } else {
            g.drawString("Loading...", x+300, y+190);
            if(!this.retrieving){
                this.retrieving = true;
                this.retrievalThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try{
                            imageIcon = new ImageIcon(imageUrl, "Image");
                            c.repaint();
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                });
                this.retrievalThread.start();
            }
        }
    }
}
