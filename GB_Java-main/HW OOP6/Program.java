import java.io.IOException;

import GuessNumberGame.ConsoleView;
import GuessNumberGame.GuessNumGame;
import GuessNumberGame.Presenter;
import PersonWithinPersonTest.Person;
import SaveLoadSystem.SaveLoader;


/**
 * Program
 */
public class Program {

    public static void main(String[] args) throws ClassNotFoundException, IOException {
        Presenter<GuessNumGame, ConsoleView> Game1 = new Presenter<GuessNumGame,ConsoleView>(new GuessNumGame(), new ConsoleView());
        Game1.startGame();

        Presenter<GuessNumGame, ConsoleView> Game2 = new Presenter<GuessNumGame,ConsoleView>(new GuessNumGame(), new ConsoleView());
        Game2.startGame();
    }

}
