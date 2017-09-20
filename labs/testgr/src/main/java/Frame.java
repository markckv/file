package main.java;

import main.java.cg.JPanell;
import main.java.cg.MainFrame;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.PortUnreachableException;

/**
 * Created by mark on 13.08.17.
 */
public class Frame extends MainFrame {
    File newFile;
    String nameFile;
    BufferedImage newBF ;
    JPanell jp;
    public Frame(int i, int i1, String test) throws NoSuchMethodException {
        super(i,i1,test);
        this.addSubMenu("File",0);
        this.addMenuItem("File/open","open",0,"f.png","open");
        this.addToolBarButton("File/open");
        this.addMenuItem("File/save","save",0,"save.png","save");
        this.addToolBarButton("File/save");

        jp = new JPanell();
        jp.setSize(this.getWidth(), this.getHeight());
        this.add(jp);
    }
    public void draw(){
        BufferedImage BI = new BufferedImage(this.getWidth(), this.getHeight(), BufferedImage.TYPE_INT_ARGB);


    }
public void compression(File file) throws IOException {
    BufferedImage BI = ImageIO.read(file);
    Graphics graphics1 = BI.getGraphics();
    graphics1.setColor(Color.WHITE);
    graphics1.fillRect(0, 0, BI.getWidth(), BI.getHeight());
    graphics1.setColor(Color.RED);
    try {
        fill(graphics1,file);
    } catch (IOException e) {
        e.printStackTrace();
    }
    //newBF = BI;
}


    public void open() throws IOException {

       File file =  this.getOpenFileName("txt", "text");
compression(file);



}
    public void save() throws IOException {
     newFile = this.getSaveFileName("png", "png");
        ImageIO.write(newBF,"png" , newFile);
}
    public void fill(Graphics graphics1, File file ) throws IOException {
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
newBF = BF2;
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
    }
}
