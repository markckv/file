package main.java.cg;

import com.sun.corba.se.impl.orbutil.graph.Graph;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JPanell extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        BufferedImage BI = new BufferedImage(this.getWidth(), this.getHeight(), BufferedImage.TYPE_INT_ARGB);

        Graphics graphics1 = BI.getGraphics();
        graphics1.setColor(Color.WHITE);
        graphics1.fillRect(0, 0, BI.getWidth(), BI.getHeight());
        graphics1.setColor(Color.RED);


        BufferedImage BI2 = new BufferedImage(this.getWidth(), this.getHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics graphics12 = BI.getGraphics();
       //graphics1.drawRect(50, 50, 50, 50);
      //  graphics1.drawOval(50, 50, 50, 50);
       // graphics1.drawOval(60, 60, 10, 10);
        fill(graphics1);
        graphics.drawImage(BI, 0, 0, null);
//graphics.drawImage(BI2, 150,50,null);
    }

    public void fill(Graphics graphics1 ) {
        //!!!!!!!!!!!!!!!!!!!! Тут числа
        int size = 10;
        int size2 = 10;
        int sizedraw = (size/2)+1;
        int x=100;
        int y=100;
        for(int iy = 0; iy<size2; iy++){
            y = 100+(60*iy);
        for(int xi = 1; xi<sizedraw; xi++) {
            draw(x+(xi*60), y, graphics1);
            draw(x+30+(xi*60), y+30, graphics1);
        }

        if(size % 2 != 0){
            draw(x+(sizedraw*60), y, graphics1);
        }}

}

public void draw(int x, int y, Graphics graphics1){
        graphics1.drawLine(x,y,x+15,y+30);
    graphics1.drawLine(x,y,x+15,y-30);

    graphics1.drawLine(x+15,y+30,x+30,y+30);
    graphics1.drawLine(x+15,y-30,x+30,y-30);

    graphics1.drawLine(x+30,y+30,x+45,y);
    graphics1.drawLine(x+30,y-30,x+45,y);
}
}




