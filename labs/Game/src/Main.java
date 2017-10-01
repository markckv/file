import javax.swing.*;
import java.io.IOException;

public class Main { public static void main(String[] arg) throws IOException {
    Controller controller = new Controller();
    Model model = new Model();
    View view = new View();
    view.setController(controller);
    view.setModel(model);
    controller.setModel(model);
    controller.setView(view);
    JFrame jFrame = new JFrame();
    jFrame.add(view);
    jFrame.setVisible(true);
    jFrame.setResizable(false);
    jFrame.setSize(1280,720);
    view.repaint();
}
}
