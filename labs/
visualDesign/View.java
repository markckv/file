import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;

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

int a = getWidth()-30/2;
int b = a/20;
int c= b*20;
int a2= getHeight()*8/9;
        int b2 = a2/20;
        int c2= b2*20;
        if( getWidth()>c2*2) {
            field1.setsize(Math.min(c,c2));
            field2.setsize(Math.min(c, c2));

            field1.drawField(0, 0, graphics);
            field2.drawField(c2 + 5, 0, graphics);
        }else{
            int width = getWidth()-30;
            int width2 = width/20;
            int width3 = width2*20;
            int a3 = width3/2;



            field1.setsize(Math.min(a3, a3));
            field2.setsize(Math.min(a3, a3));

            field1.drawField(0, 0, graphics);
            field2.drawField(a3+5 + 5, 0, graphics);
        }
        int[] mas = new int[4];
        Random random = new Random();
        mas[0] = random.nextInt();
        mas[1] = random.nextInt();
        mas[2] = random.nextInt();
        mas[3] = random.nextInt();
info(mas , graphics);




    }
    public void info(int[] inf  ,Graphics graphics ){
int distance = getWidth()  /4;

        graphics.drawString("Баллы:"+inf[0] ,5 , getHeight() -20 );
        graphics.drawString("Баллы соперника:"+ inf[1] ,distance , getHeight() -20 );
        graphics.drawString("Время с начала игры:" + inf[2],distance*2 , getHeight() -20 );
        graphics.drawString("количество сброшенных фигур:"+inf[3] ,distance*3 , getHeight() -20 );
    }



}
