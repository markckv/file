package main.java.cg;

import com.sun.corba.se.impl.orbutil.graph.Graph;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class JPanell extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        BufferedImage BI = new BufferedImage(this.getWidth(), this.getHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics graphics1 = BI.getGraphics();
        graphics1.setColor(Color.RED);
        graphics1.drawOval(50, 50, 50, 50);
        fill(BI);
        graphics.drawImage(BI, 50, 50, null);

    }

    public void fill(BufferedImage BI) {
        ArrayList<Integer> spanx1 = new ArrayList<Integer>();
        ArrayList<Integer> spanx2 = new ArrayList<Integer>();
        ArrayList<Integer> spany = new ArrayList<Integer>();
        int x, y;
        x = 75;
        y = 75;
        int tx = 0;
        int ty=0;
        int color = BI.getRGB(75, 75);
        for (int i = 0; i < x; i++) {
            if (BI.getRGB(x - i, y) == color) {
                BI.setRGB(x - i, y, Color.black.getRGB());
            } else {
                spany.add(y);
                spanx2.add(x - i);
                break;
            }
        }
        for (int i = 1; i < x; i++) {
            if (BI.getRGB(x + i, y) == color) {
                BI.setRGB(x + i, y, Color.black.getRGB());
            } else {
                spanx1.add(x + i);
                break;
            }

        }
        for (int i = 0; i < x; i++) {
            if (BI.getRGB(spanx1.get(0) + i, y + 1) == color) {
                tx = spanx1.get(0) + i;
                spanx1.add(spanx1.get(0) + i);
                for (int i1 = 0; i1 < x; i1++) {
                    if (BI.getRGB(tx,y+1)==color){
                        BI.setRGB(tx+i1, 1 + y, Color.black.getRGB());
                    }
                }
            }
        }
    }
}
