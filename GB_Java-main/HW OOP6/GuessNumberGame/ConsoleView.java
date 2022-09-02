package GuessNumberGame;

import java.util.Scanner;

public class ConsoleView implements View {
    private Scanner in = new Scanner(System.in);
    
    public String getInput(String message){
        System.out.printf("%s", message);
        return in.next();
    }

    public void printOutput(String message){
        System.out.printf("%s", message);
    }

}
