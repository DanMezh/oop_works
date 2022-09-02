/**
 * Start of program
 */
public class Start {

    public static void main(String[] args) {
        int[][] boxMaze = { { -1, -1, -1, -1, -1 },
                            { -1,  0,  0,  0, -1 },
                            { -1, -1, -1, -1, -1 } };
        int[][] simpleMaze = { { -1, -1, -1, -1, -1, -1, -1, -1, -1 },
                               { -1,  0, -1,  0,  0,  0,  0,  0, -1 },
                               { -1,  0, -1,  0,  0,  0,  0,  0, -1 },
                               { -1,  0, -1,  0, -1, -1, -1,  0, -1 },
                               { -1,  0, -1,  0, -1,  0,  0,  0, -1 },
                               { -1,  0, -1, -1, -1,  0, -1,  0, -1 },
                               { -1,  0,  0,  0,  0,  0, -1,  0, -1 },
                               { -1,  0,  0,  0,  0,  0, -1,  0, -1 },
                               { -1, -1, -1, -1, -1, -1, -1, -1, -1 } };
        int[][] impossibleMaze = { { -1, -1, -1, -1, -1 },
                                   { -1,  0, -1,  0, -1 },
                                   { -1,  0, -1,  0, -1 },
                                   { -1,  0, -1,  0, -1 },
                                   { -1,  0, -1,  0, -1 },
                                   { -1, -1, -1, -1, -1 } };

        Point cat = new Point(1, 1);
        Point food = new Point(3, 1);
        System.out.println("Коробка");
        System.out.println(WavePathfinder.showPath(cat, food, boxMaze));
        System.out.println("Простой лабиринт");
        System.out.println(WavePathfinder.showPath(cat, food, simpleMaze));
        System.out.println("Невозможный лабиринт");
        System.out.println(WavePathfinder.showPath(cat, food, impossibleMaze));

    }
}