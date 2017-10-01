import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Model {
    List<GameObject> gameObjects;
    GameObject hero;
Model() throws IOException {
    ObjectLoader objectLoader = new ObjectLoader();
    gameObjects = (objectLoader.loadGameObjects());
    hero = gameObjects.get(0);
}
    public List<GameObject> getVisibleObjects() {
       int borderL = hero.x-700;
       int borderR = hero.x+700;
       int listSize = gameObjects.size();
        List<GameObject> gameObjectsVisible = new ArrayList<>();
       for(int i = 0; i< listSize; i++){
           if(borderL<gameObjects.get(i).x && borderR>gameObjects.get(i).x){
               gameObjectsVisible.add(gameObjects.get(i));
           }
       }
       return  gameObjectsVisible;
    }
}
