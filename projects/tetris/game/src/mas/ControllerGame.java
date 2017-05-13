package mas;

public class ControllerGame {

   public void startGame(int deckID) {
      model.startGame(deckID);
   }

   Model model;

   public void setModel(Model model) {
     this.model = model;
   }


}

