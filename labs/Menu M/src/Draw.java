//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.awt.GridLayout;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Draw {
    Menu menu;
    JFrame JF;
    JPanel JP;

    public  Draw(Menu menu, JFrame JF) {
        this.menu = menu;
        this.JF = JF;
        this.JP = new JPanel(new GridLayout(0, 1));
    }

    public void risovanie() {
        this.JF.remove(this.JP);
        this.JP = new JPanel(new GridLayout(0, 1));
        Object[] mas = this.menu.MasStringov();
        Map mas2 = this.menu.MasZadani();
        int a = mas.length;

        for(int nameZadanie = 0; nameZadanie < a; ++nameZadanie) {
            JButton SZadanie = new JButton((String)mas[nameZadanie]);
            Button i = new Button(this.menu, this, (String)mas[nameZadanie], (TheTask)null);
            SZadanie.addActionListener(i);
            this.JP.add(SZadanie);
        }

        Object[] var9 = mas2.keySet().toArray();
        Object[] var10 = mas2.values().toArray();

        for(int var11 = 0; var11 < var9.length; ++var11) {
            JButton JB = new JButton((String)var9[var11]);
            Button bt = new Button(this.menu, this, (String)var9[var11], (TheTask)var10[var11]);
            JB.addActionListener(bt);
            this.JP.add(JB);
        }

        this.JF.add(this.JP);
        this.JP.revalidate();
        this.JF.revalidate();
        this.JP.repaint();
        this.JF.repaint();
    }
}
