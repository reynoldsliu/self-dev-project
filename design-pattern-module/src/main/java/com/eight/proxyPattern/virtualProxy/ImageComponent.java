package com.eight.proxyPattern.virtualProxy;

import javax.swing.*;
import java.awt.*;

public class ImageComponent extends JComponent {
    private Icon icon;

    public ImageComponent(Icon icon) {
        this.icon = icon;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int w = icon.getIconWidth();
        int h = icon.getIconHeight();
        int x = (getWidth() - w) / 2;
        int y = (getHeight() - h) / 2;
        icon.paintIcon(this, g, x, y);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(
                icon.getIconWidth(),
                icon.getIconHeight()
        );
    }
}
