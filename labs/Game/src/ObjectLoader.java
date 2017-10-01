import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectLoader {
    public List<GameObject> loadGameObjects() throws IOException {
        File levelFile = new File(System.getProperty("user.dir")+"/src/resourses/GameObject");
        FileReader fileReader = new FileReader(levelFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int numberObjects = Integer.parseInt( bufferedReader.readLine());
        List<GameObject> gameObjects = new ArrayList<>();
        for(int i = 0; i< numberObjects; i++){
            String string = bufferedReader.readLine();
            String[] parameters = string.split(" ");
            GameObject gameObject = new GameObject();
            gameObject.name = parameters[0];
            gameObject.image = ImageIO.read(new File(parameters[1]));
            gameObject.x = Integer.parseInt(parameters[2]);
            gameObject.y = Integer.parseInt(parameters[3]);
            gameObjects.add(gameObject);
        }
        return gameObjects;
    }
}
