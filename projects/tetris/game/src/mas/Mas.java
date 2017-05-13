package mas;

public class Mas {
    public int[][] masField1;
    public int[][] masField2;
    public int[][] conclusionField1(){
        return masField1;
    }
    public int[][] conclusionField2(){
        return masField2;
    }
    public void WriteDownANumber1(int[][] mas){
        masField1 = mas;
    }
    public void WriteDownANumber2(int[][] mas){
        masField2 = mas;
    }
    public void WriteOneNumber1(int x, int y , int a){
        masField1[x][y] = a;
    }
    public void WriteOneNumber2(int x, int y , int a){
        masField2[x][y] = a;
    }
}
