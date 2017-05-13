package visualDesign;

import com.sun.java.swing.plaf.windows.WindowsDesktopManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

/**
 * Created by mark on 15.04.17.
 */
public class Window extends JFrame{
    public Window(){
        Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = sSize.width /2;
        int height = sSize.height /2;
        setSize(width, height);


    }
}
