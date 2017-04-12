//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import javax.swing.JFrame;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        JFrame JF = new JFrame();
        JF.setSize(800, 600);
         Draw draw = new  Draw(menu, JF);
        JF.setDefaultCloseOperation(3);
        Performance performance = new Performance();
        menu.NewItem("Игра");
        menu.NewItem("Игра2");
        menu.NewItem("Игра3");
        menu.NewItem("Игра5");
        menu.NewItem("Игра/Игра8456");
        menu.NewItem("Игра/Игра41534131");
        menu.NewItem("Игра/Игра41534131/вафы", performance);
        draw.risovanie();
        JF.setVisible(true);
    }
}
