//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.HashMap;
import java.util.Map;

public class Menu {
    Menu.Element punct = new Menu.Element();
    Menu.Element uroven;

    public Menu() {
        this.uroven = this.punct;
    }

    public Map<String, TheTask> MasZadani() {
        return this.uroven.KontenerZadani;
    }

    public void perehod(String name) {
        this.uroven = (Menu.Element)this.uroven.menushi.get(name);
    }

    public Object[] MasStringov() {
        Object[] masivstring = this.uroven.menushi.keySet().toArray();
        return masivstring;
    }

    public void NewItem(String put) {
        this.NewItem(put, (TheTask)null);
    }

    public void NewItem(String put, TheTask performance) {
        String[] masiv = put.split("/");
        int KPunktov = masiv.length;
        --KPunktov;
        Menu.Element punkt2 = this.punct;

        for(int punct3 = 0; punct3 < KPunktov; ++punct3) {
            punkt2 = (Menu.Element)punkt2.menushi.get(masiv[punct3]);
        }

        if(performance != null) {
            punkt2.newZadanie(performance, masiv[masiv.length - 1]);
        } else {
            Menu.Element var7 = new Menu.Element();
            punkt2.menushi.put(masiv[KPunktov], var7);
        }

    }

    private class Element {
        Map<String, Menu.Element> menushi = new HashMap();
        Map<String, TheTask> KontenerZadani = new HashMap();

        public Element() {
        }

        public void newZadanie(TheTask performance, String name) {
            this.KontenerZadani.put(name, performance);
        }
    }
}
