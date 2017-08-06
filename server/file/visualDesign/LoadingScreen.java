package main.visualDesign;

import main.ControllerGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.image.BufferedImage;
import java.util.Observable;
import java.util.Observer;

public class LoadingScreen extends JPanel implements Observer {
    //Dimension size = null;

    @Override
    public void paintComponent(Graphics graphics) {
        BufferedImage BI = new BufferedImage(this.getWidth() , this.getHeight(),BufferedImage.TYPE_INT_RGB);

        Graphics graphics1 = BI.getGraphics();
        graphics.fillRect(0, 0, BI.getWidth(), BI.getHeight());
        int Width1 = 16;
        int Height1 = 9;
        int Width = this.getWidth() / Width1 ; //высота
        int Height =this.getHeight() / Height1;
        for (int i = 0; i<Width1; i++){
            graphics1.drawLine(Width * i , 0, Width * i ,this.getHeight() );
        }
        for (int i = 0; i<Height1; i++){
            graphics1.drawLine(  0,Height * i , this.getWidth() ,Height * i );
        }
        graphics.drawImage(BI, 0, 0, this.getWidth(),this.getHeight(), 0, 0, BI.getWidth()-1, BI.getHeight()-1, null);


    }
    JButton deck1;
    JButton deck2;
    JButton deck3;
    ControllerGame controllerGame;
    public LoadingScreen(){

        deck1 = new JButton("Колода 1");
        deck2 = new JButton("Колода 2");
        deck3 = new JButton("Колода 3");
        this.add(deck1);
        this.add(deck2);
        this.add(deck3);
        this.setLayout(null);
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent componentEvent) {
                super.componentResized(componentEvent);
                Dimension size = componentEvent.getComponent().getSize();
                int width = (int) (size.width / 13.0);
                int height = (int) (size.height / 5.0);
                deck1.setSize(width * 3, height);
                deck2.setSize(width * 3, height);
                deck3.setSize(width * 3, height);
                deck1.setLocation(width, height * 2);
                deck2.setLocation(width * 5, height * 2);
                deck3.setLocation(width * 9, height * 2);
                revalidate();
                repaint();

            }
        });
    deck1.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
controllerGame.startGame(1);
        }

    });

    }

    @Override
    public void update(Observable observable, Object o) {
        this.setVisible(false);

    }
    public void setController(ControllerGame controllerGame){
        this.controllerGame = controllerGame;
    }
}
;
        }

    });

    }

    @Override
    public void update(Observable observable, Object o) {
        this.setVisible(false);

    }
    public void setController(ControllerGame controllerGame){
        this.controllerGam