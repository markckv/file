import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by mark on 15.04.17.
 */
public class View extends JPanel implements Observer {
    Field field1;
    Field field2;
    ControllerGame controllerGame;
    public View(){

        field1 = new Field(20);
        field2 = new Field(20);


    }


    @Override
    public void update(Observable observable, Object o) {
        this.setVisible(true);
        if (o instanceof Mas){
        Mas mas = (Mas) o;

       field1.setMas(mas.masField1);
            field2.setMas(mas.masField2);
    }
    }
    @Override
    public void paintComponent(Graphics graphics) {

        field1.setsize(Math.min(getWidth()/2, getHeight())*8/9);
        field2.setsize(Math.min(getWidth()/2, getHeight())*8/9);

        field1.drawField(0, 0, graphics);
        field2.drawField( this.getWidth()/2, 0, graphics);



    }



}
