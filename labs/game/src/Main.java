import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Window window = new Window();
        LoadingScreen LS = new LoadingScreen();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.add(LS);
        window.setVisible(true);
Model model = new Model();
ControllerGame controllerGame = new ControllerGame();
model.controllerGame(controllerGame);

View view = new View();

model.addObserver(LS);
model.addObserver(view);
window.add(view);
LS.setController(controllerGame);
controllerGame.setModel(model);


    }
}
