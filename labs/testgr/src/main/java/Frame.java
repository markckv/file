package main.java;

import main.java.cg.JPanell;
import main.java.cg.MainFrame;

import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.PortUnreachableException;

/**
 * Created by mark on 13.08.17.
 */
public class Frame extends MainFrame {
    File file;
    JPanell jp;
    public Frame(int i, int i1, String test) throws NoSuchMethodException {
        super(i,i1,test);
        this.addSubMenu("File",0);
        this.addMenuItem("File/open","open",0,"f.png","open");
        this.addToolBarButton("File/open");

        jp = new JPanell();
        jp.setSize(this.getWidth(), this.getHeight());
        this.add(jp);
    }
    public void draw(){
        BufferedImage BI = new BufferedImage(this.getWidth(), this.getHeight(), BufferedImage.TYPE_INT_ARGB);


    }


    public void open() throws IOException {file =  this.getOpenFileName("txt", "text");
        Reader reader = new FileReader(file);
        BufferedReader Breader = new BufferedReader(reader);
        String string = Breader.readLine();
        System.out.print(string);
        string = Breader.readLine();
        System.out.println(string);
        Writer writer = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.write(string,0,string.length());
        bufferedWriter.close();
        Breader.close();
        writer.close();
        reader.close();



}}
