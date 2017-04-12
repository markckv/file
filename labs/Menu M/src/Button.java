//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button implements ActionListener {
     Draw draw;
    Menu menu;
    String name;
    TheTask performance;

    public Button(Menu menu,  Draw draw, String name, TheTask performance) {
        this.menu = menu;
        this.draw = draw;
        this.name = name;
        this.performance = performance;
    }

    public void actionPerformed(ActionEvent e) {
        if(this.performance != null) {
            this.performance.ExecutedTask();
        } else {
            this.menu.perehod(this.name);
            this.draw.risovanie();
        }

    }
}
