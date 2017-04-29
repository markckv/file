import java.util.Observable;
import java.util.Random;

/**
 * Created by mark on 23.04.17.
 */
public class Model extends Observable {
    ControllerGame controllerGame;
    public void startGame(int deckID) {
        setChanged();
        notifyObservers();
        random();
    }

    public void random(){
        int[][] mas = new int[20][20];
        for (int i1 = 0 ; i1 < 20; i1++) {
        for (int i = 0 ; i < 20; i++) {
            Random random = new Random();
            mas[i][i1] = random.nextInt(9);
        }
        Mas fieldInfo = new Mas();
        fieldInfo.masField1 = mas;
        fieldInfo.masField2 = mas;
this.setChanged();
        this.notifyObservers(fieldInfo);
    }}
    public void controllerGame(ControllerGame controllerGame ){
        this.controllerGame = controllerGame;
    }

}
