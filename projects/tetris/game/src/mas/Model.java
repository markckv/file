package mas;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Model extends Observable {
    ControllerGame controllerGame;
    public void startGame(int deckID) {
        setChanged();
        notifyObservers();
        figure();
    }
    public void setCell(int[][] field , Figure figure){
        PairInt pi = figure.O;
        field[pi.x][pi.y] = figure.color;
        for(int i = 0; i< figure.figurePoints.size(); i++){
           PairInt pi2 = figure.figurePoints.get(i);
            field[pi.y + pi2.y ][pi.x + pi2.x] = figure.color;
        }
    }
    public void fall(Figure figure){
        figure.O.y++;

    }
    public void rotate(Figure figure) {
for(int i = 0; i < figure.figurePoints.size(); i++){
    PairInt p = figure.figurePoints.get(i);
    int a = p.x;
    p.x = p.y;
   p.y = -a;
}
    }
    public void figure(){
        int[][] mas = new int[20][20];
        PairInt O = new PairInt(5,5);
        PairInt O1 = new PairInt(0,0);
        PairInt O2 = new PairInt(-1,0);
        PairInt O3 = new PairInt(1,1);
        PairInt O4 = new PairInt(0,1);
        List<PairInt> pi = new ArrayList<>();
        pi.add(O1);
        pi.add(O2);
        pi.add(O3);
        pi.add(O4);
        Figure figure = new Figure(O, pi, 6);
        setCell(mas, figure);
        Mas fieldInfo = new Mas();
        fieldInfo.masField1 = mas;//!!!!!!!!!!!!!!!!!1
        fieldInfo.masField2 = mas;
this.setChanged();
        this.notifyObservers(fieldInfo);
    }
    public void controllerGame(ControllerGame controllerGame ){
        this.controllerGame = controllerGame;
    }

}
