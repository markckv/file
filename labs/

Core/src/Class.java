import java.awt.*;
import java.util.Scanner;

/**
 * Created by mark on 19.03.17.
 */
public class Class {
    public static void main(String[] args){
System.out.print("ff");
        int[] hislo = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<10;i++){
            hislo[i] = sc.nextInt();
        }
        potok p = new potok();
        p.run(hislo);


    }
    public static void vivid(int a){
        System.out.print(a);
    }
}
