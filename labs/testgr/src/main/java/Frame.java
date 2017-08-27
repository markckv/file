package main.java;

import main.java.cg.JPanell;
import main.java.cg.MainFrame;

import javax.swing.*;
import java.awt.image.BufferedImage;
import java.net.PortUnreachableException;

/**
 * Created by mark on 13.08.17.
 */
public class Frame extends MainFrame {
    JPanell jp;
    public Frame(int i, int i1, String test) throws NoSuchMethodException {
        super(i,i1,test);
        this.addSubMenu("testt",0);
        this.addMenuItem("testt/test","test2",0,"p.png","f");
        this.addToolBarButton("testt/test");
        jp = new JPanell();
        jp.setSize(this.getWidth(), this.getHeight());
        this.add(jp);
    }
    public void draw(){
        BufferedImage BI = new BufferedImage(this.getWidth(), this.getHeight(), BufferedImage.TYPE_INT_ARGB);


    }

    public void f(){
        System.out.print("4");
    }
}
