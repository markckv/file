package main.java.cg;

import com.sun.corba.se.impl.orbutil.graph.Graph;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JPanell extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      /*  super.paintComponent(graphics);
        BufferedImage BI = new BufferedImage(this.getWidth(), this.getHeight(), BufferedImage.TYPE_INT_ARGB);

        Graphics graphics1 = BI.getGraphics();
        graphics1.setColor(Color.WHITE);
        graphics1.fillRect(0, 0, BI.getWidth(), BI.getHeight());
        graphics1.setColor(Color.RED);


        BufferedImage BI2 = new BufferedImage(this.getWidth(), this.getHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics graphics12 = BI.getGraphics();
        try {
            fill(graphics1 );
        } catch (IOException e) {
            e.printStackTrace();
        }
        graphics.drawImage(BI, 0, 0, null);
//graphics.drawImage(BI2, 150,50,null);*/
    }

   /* public void fill(Graphics graphics1 ) throws IOException {

        BufferedImage BF = ImageIO.read(file);
        //ImageIO.write()//
        graphics1.drawImage(BF, 0, 0, null);
        BufferedImage BF2 = new BufferedImage( BF.getWidth(),BF.getHeight(), BufferedImage.TYPE_INT_ARGB);
        int[][] m = new int[2][2];
        m[0][0]=0;
        m[0][1]=2;
        m[1][0]=3;
        m[1][1]=1;
        m = scale(m);
        m = scale(m);
        m = scale(m);
        for(int i = 0; i<  BF.getWidth(); i++){
            for(int i1 = 0; i1<  BF.getHeight(); i1++){
                int color = BF.getRGB(i,i1);
                Color color1= new Color(color);
                int colorR = color1.getRed();
                int colorG = color1.getGreen();
                int colorB = color1.getBlue();
                colorR = transformColor(colorR, m.length, m[i%m.length][i1%m.length]);
                colorG = transformColor(colorG, m.length, m[i%m.length][i1%m.length]);
                colorB = transformColor(colorB, m.length, m[i%m.length][i1%m.length]);
               Color colorNew = new Color(colorR, colorG, colorB);
               BF2.setRGB(i,i1, colorNew.getRGB());
            }
        }
        graphics1.drawImage(BF2, BF.getWidth(),0, null);

    }
public int transformColor(int color, int n, int compareColor){
    color = (color*(n* n + 1))/256;
    if(color>  compareColor){
        color= 255;
    }else {
        color = 0;
    }
    return color;
}
public int[][] scale(int[][] m){
    int[][] newm= new int[m.length*2][m.length*2];
    for(int i = 0; i< m.length; i++){
        for(int i1 = 0; i1< m.length; i1++){
            newm[i][i1] = 4*m[i][i1];
            newm[i+m.length][i1] = 4*m[i][i1]+3;
            newm[i+m.length][i1+m.length] = 4*m[i][i1]+1;
            newm[i][i1+m.length] = 4*m[i][i1]+2;
    }

}
return newm;
}*/

}




