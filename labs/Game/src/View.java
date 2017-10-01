import javax.swing.*;
import java.awt.*;
import java.util.List;

public class View extends JPanel{
    Model model;
    Controller controller;
    public void setModel(Model model){
        this.model = model;
    }
    public void setController(Controller controller){
        this.controller = controller;
    }
    public void openWindow(){

    }

    @Override
    public void paintComponent(Graphics g) {
        draw(g);
    }

public void draw(Graphics g){
    List<GameObject> gameObjects = model.getVisibleObjects();
    for(int i = 0; i<gameObjects.size(); i++){
        g.drawImage(gameObjects.get(i).image,gameObjects.get(i).x, gameObjects.get(i).y, null);
    }
}

}
