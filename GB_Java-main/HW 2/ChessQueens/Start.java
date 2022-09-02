package ChessQueens;

public class Start {
    public static void main(String[] args) {
        QueensProblem QueenP1 = new QueensProblem();
        QueenP1.findSolution(1); //аргумент кол-во решений после которого останавливаться, 0 - вывод и поиск всех решений
    }
}
