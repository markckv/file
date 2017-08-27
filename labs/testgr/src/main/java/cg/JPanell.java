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
        graphics1.drawOval(60, 60, 10, 10);
        fill(BI);
        graphics.drawImage(BI, 50, 50, null);

    }

    public void fill(BufferedImage BI) {
        Span span = null;
        Span span2 = null;
        Span span3 = null;
        ArrayList<Span> spans = new ArrayList<Span>();
        int x, y;
        x = 75;
        y = 75;
        int tx = 0;
        int ty = 0;
        int color = BI.getRGB(75, 75);
       span =  paint(BI,y,x, color);
        if(span != null) {
            spans.add(span);
span3 = span;
        }

        while (0 != spans.size()){
            span = spans.get(spans.size()-1);
            //System.out.println(span.xl+"| |"+span.xr+"| |"+span.y+"| |"+(span.xr-span.xl));
            for(int c= 0; c< spans.size(); c++) {
                span = spans.get(c);
                for (int i = span.xl; i < span.xr; i++)
                    BI.setRGB(i, span.y, Color.black.getRGB());
            }
            spans.remove(spans.size()-1);
            for(int i = span.xl; i < span.xr; i++) {
                span2 = paint(BI, span.y - 1, i, color);
                if (span.y == 71) {
                    System.out.println("Span" + span2.xl + " " + span2.xr);
                    System.out.println("I = " + i);
                }
                if(span2 != null) {
                    i = span.xr + 1;
                    spans.add(span2);
                }
            }
        }
        span =  span3;
        spans.add(span);

        while (0 != spans.size()){
            span = spans.get(spans.size()-1);
            //System.out.println(span.xl+"| |"+span.xr+"| |"+span.y);
            spans.remove(spans.size()-1);
            for(int i = span.xl ; i<span.xr; i++)
                BI.setRGB(i, span.y, Color.black.getRGB());
            for(int i = span.xl; i < span.xr; i++) {
                span2 = paint(BI, span.y + 1, i, color);
                if(span2 != null) {
                    i = span.xr +1;
                    spans.add(span2);
                }
            }
        }




    }
    public Span paint(BufferedImage BI, int y, int x , int color){
        Span span = new Span();
        for (int i = 0; i < x; i++) {
            if (BI.getRGB(x - i, y) != color) {
                span = new Span();
                span.xl = x - i+1;
                span.y = y;
                break;
            }
        }
        for (int i = 1; i < x; i++) {
            if (BI.getRGB(x + i, y) != color) {
                span.xr = x + i;
              return (span);
            }


        }
        return (null);
    }
}
