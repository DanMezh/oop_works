package CheesHorse;

import java.util.ArrayList;

public class Start {

    static int[][] desk = new int[5][5];

    static int[][] horseMoves = new int[][]{
        {2,1},
        {2,-1},
        {1,2},
        {1,-2},
        {-2,1},
        {-2,-1},
        {-1,2},
        {-1,-2},
    };

    static int operationMade;
    
    static void printDesk(int[][] desk) {
        for (int i = 0; i < desk.length; i++) {
            for (int j = 0; j < desk[i].length; j++) {
                System.out.print(" " + desk[i][j] + " ");
            }
            System.out.println();
        }
    }

    static Boolean movePossible(int x, int y){
        if ((x >= 0) && (x < desk.length) && (y >= 0) && (y < desk[0].length) && (desk[x][y] == 0)) {
            return true;
        }
        return false;
    }

    static Boolean placeHorse(int x, int y, int moveNum){
        operationMade++;
        desk[x][y] = moveNum; //ставим коня
        //System.out.println("ход:" + moveNum + " x:" + x + " y:" + y + " Поле доски:" + desk[x][y]);
        if (moveNum == (desk.length * desk[0].length)) {return true;} //проверка что все ходы записаны

        for (int[] nextMove : horseMoves) {
            int nextX = x + nextMove[0];
            int nextY = y + nextMove[1];
            if ((movePossible(nextX, nextY)) && (placeHorse(nextX,nextY,moveNum+1))) return true;
        }

        desk[x][y] = 0; //отменяем постановку коня
        return false;
    }
    public static void main(String[] args) {
        printDesk(desk);
        placeHorse(4,4,1);
        System.out.println("---------------------");
        System.out.println(operationMade);
        printDesk(desk);
    }

/*     void find_path()
    {
     for( move_num = 1 ; move_num <= max_moves ; )
     {
     if( make_move() ) // Сделать ход.
        move_num++ ;
     else // Ход невозможен.
     if( move_num > 1 )
     {
        undo_move() ; // Отменить ход.
        move_num-- ;
     }
     else
     return ; // Обход невозможен.
     }
    } */
}
