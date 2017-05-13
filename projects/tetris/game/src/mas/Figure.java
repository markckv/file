package mas;

import java.util.List;

/**
 * Created by mark on 06.05.17.
 */
public class Figure {
    public List<PairInt> figurePoints;
    PairInt O;
    int color;
    public Figure(PairInt pi, List<PairInt> figurePoints , int color){
       this.figurePoints = figurePoints;
       O = pi;
        this.color = color;

    }
}
