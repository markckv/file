import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.SampleModel;
import java.net.PortUnreachableException;

/**
 * Created by mark on 15.04.17.
 */
public class Field {
    public void setMas(int[][] mas)
    {
        this.mas = mas;
    }
    BufferedImage BI;
    int squareNumber;
int a;
    public Field(int squareNumber) {
        this.squareNumber = squareNumber;
        setsize(456);
    }


    public void setsize(int sideSize) {
        BI = new BufferedImage(sideSize, sideSize, BufferedImage.TYPE_INT_RGB);
        Graphics graphics = BI.getGraphics();
        graphics.setColor(Color.white);
        graphics.fillRect(0, 0, BI.getWidth(), BI.getHeight());
    }

    private void drawGrid() {
        int size = BI.getHeight();
        size = size / squareNumber;
        int theLastCell = size * squareNumber;
        Graphics graphics1 = BI.getGraphics();
        graphics1.setColor(Color.black);
        for (int i = 0; i <= squareNumber; i++) {
            graphics1.drawLine(size * i, 0, size * i, BI.getHeight());
        }
        for (int i = 0; i <= squareNumber; i++) {
            graphics1.drawLine(0, size * i, BI.getHeight(), size * i);

        }


    }

    public void drawField(int x, int y, Graphics graphics) {

        if (mas != null)
drawingTheField(mas);
        drawGrid();
        graphics.drawImage(BI, x, y, null);
    }
    int[][] mas;
    public void drawingTheField(int w , int h) {
        if (mas == null)
            return;

    drawingTheField(mas);

    }
    public void drawingTheField(int[][] mas) {
        this.mas = mas;
        int size = BI.getHeight();
        size = size / squareNumber;
        int number = 0;
        Graphics graphics = BI.getGraphics();

            for (int x = 0; x < squareNumber; x++)
                for (int y = 0; y < squareNumber; y++){


                  if(mas[x][y] == 0 ){
                      graphics.setColor(Color.white);
                  }
                    if(mas[x][y] == 1 ){
                        graphics.setColor(Color.blue);
                    }
                    if(mas[x][y] == 2 ){
                        graphics.setColor(Color.red);
                    }
                if(mas[x][y] == 3 ){
                    graphics.setColor(Color.PINK);
                }
                if(mas[x][y] == 4 ){
                    graphics.setColor(Color.MAGENTA);
                }
                if(mas[x][y] == 5 ){
                    graphics.setColor(Color.yellow);
                }
                if(mas[x][y] == 6 ){
                    graphics.setColor(Color.green);
                }
                if(mas[x][y] == 7 ){
                    graphics.setColor(Color.lightGray);
                }
                if(mas[x][y] == 8 ){
                    graphics.setColor(Color.orange);
                }
                if(mas[x][y] == 9 ){
                    graphics.setColor(Color.darkGray);
                }



                   graphics.fillRect(size*x +1  , size*y +1 , size , size);
System.out.println(" "+size);
                }

    }

}
