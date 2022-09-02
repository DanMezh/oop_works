import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class WavePathfinder {
    static int[][] wavedMaze;

    /**
     * Пускаем волну
     * 
     * @param point1 - начальная точка
     */
    private static void runWave(Point point1) {
        Queue<Point> pointsQueue = new LinkedList<Point>();
        pointsQueue.add(point1);
        wavedMaze[point1.getX()][point1.getY()] = 1;
        while (!pointsQueue.isEmpty()) {
            Point curPoint = pointsQueue.poll();
            int x = curPoint.getX();
            int y = curPoint.getY();

            if (wavedMaze[x][y - 1] == 0) { // top
                pointsQueue.add(new Point(x, y - 1));
                wavedMaze[x][y - 1] = wavedMaze[x][y] + 1;
            }
            if (wavedMaze[x + 1][y] == 0) { // right
                pointsQueue.add(new Point(x + 1, y));
                wavedMaze[x + 1][y] = wavedMaze[x][y] + 1;
            }
            if (wavedMaze[x][y + 1] == 0) { // bottom
                pointsQueue.add(new Point(x, y + 1));
                wavedMaze[x][y + 1] = wavedMaze[x][y] + 1;
            }
            if (wavedMaze[x - 1][y] == 0) { // left
                pointsQueue.add(new Point(x - 1, y));
                wavedMaze[x - 1][y] = wavedMaze[x][y] + 1;
            }
        }
    }

    /**
     * Восстанавливаем путь
     * 
     * @param point2 - конечная точка
     * @return - массив точек пути
     */
    private static ArrayList<Point> getPath(Point point2) {
        ArrayList<Point> path = new ArrayList<>();
        Point curPoint = point2;
        path.add(curPoint);

        while (wavedMaze[curPoint.getY()][curPoint.getX()] != 1) {
            int x = curPoint.getX();
            int y = curPoint.getY();
            if (wavedMaze[y][x] - wavedMaze[y - 1][x] == 1) {
                curPoint = new Point(x, y - 1);
                path.add(curPoint);
                continue;
            }
            if (wavedMaze[y][x] - wavedMaze[y][x + 1] == 1) {
                curPoint = new Point(x + 1, y);
                path.add(curPoint);
                continue;
            }
            if (wavedMaze[y][x] - wavedMaze[y + 1][x] == 1) {
                curPoint = new Point(x, y + 1);
                path.add(curPoint);
                continue;
            }
            if (wavedMaze[y][x] - wavedMaze[y][x - 1] == 1) {
                curPoint = new Point(x - 1, y);
                path.add(curPoint);
                continue;
            }

        }
        return path;
    }

    /**
     * Рисуем путь через установку во временном лабиринте соответсвующих маркерующих
     * значений
     * 
     * @param path - массив точек пути
     */
    private static void drawPath(ArrayList<Point> path) {
        if (path.size() > 2) {
            int prevX, prevY;
            int nextX, nextY;
            int curX, curY;
            prevX = path.get(0).getX();
            prevY = path.get(0).getY();
            for (int i = 1; i < path.size() - 1; i++) {
                curX = path.get(i).getX();
                curY = path.get(i).getY();
                nextX = path.get(i + 1).getX();
                nextY = path.get(i + 1).getY();

                switch (nextX - prevX) {
                    case 0:
                        wavedMaze[curY][curX] = -12; // " │ "
                        break;
                    case 1:
                        if (nextX - curX == 0) {
                            if (nextY - curY == 1) {
                                wavedMaze[curY][curX] = -13; // " ┐ "
                            } else { // -1
                                wavedMaze[curY][curX] = -14; // " ┘ "
                            }
                        } else { // +1
                            if (nextY - prevY == 1) {
                                wavedMaze[curY][curX] = -15; // " └ "
                            } else { // -1
                                wavedMaze[curY][curX] = -16; // " ┌ "
                            }
                        }
                        break;
                    case -1:
                        if (nextX - curX == 0) {
                            if (nextY - curY == 1) {
                                wavedMaze[curY][curX] = -16; // " ┌ "
                            } else { // -1
                                wavedMaze[curY][curX] = -15; // " └ "
                            }
                        } else { // +1
                            if (nextY - curY == 1) {
                                wavedMaze[curY][curX] = -13;  // " ┐ "
                            } else { // -1
                                wavedMaze[curY][curX] = -14;  // " ┘ "
                            }
                        }
                        break;
                    case -2, 2:
                        wavedMaze[curY][curX] = -11; // " - "
                        break;
                    default:
                        break;
                }
                prevX = curX;
                prevY = curY;
            }
        }
    }

    /**
     * Show path from point 1 to point 2
     * 
     * @param point1 - Point object;
     * @param point2 - Point object;
     * @param maze   - maze as int[][] array;
     * @return - String visualized maze with path;
     */
    public static String showPath(Point point1, Point point2, int[][] maze) {
        wavedMaze = maze;
        if (wavedMaze[point1.getY()][point1.getX()] != 0) { // can't start in wall
            return "Can't start in wall";
        }
        if (wavedMaze[point2.getY()][point2.getX()] != 0) { // can't exit at wall
            return "Can't exit in wall";
        }
        runWave(point1);
        if (wavedMaze[point2.getY()][point2.getX()] < 2) { // if exit can't be reached
            wavedMaze[point1.getY()][point1.getX()] = -10; // для отображения точки входа
            wavedMaze[point2.getY()][point2.getX()] = -20; // для отображения точки выхода
            return "Can't reach exit ! \n"+ printMazeString(); // pathfind sucess
        }
        drawPath(getPath(point2));
        wavedMaze[point1.getY()][point1.getX()] = -10; // для отображения точки входа
        wavedMaze[point2.getY()][point2.getX()] = -20; // для отображения точки выхода
        return printMazeString(); // pathfind sucess
    }

    private static String printMazeString() {
        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < wavedMaze.length; row++) {
            for (int col = 0; col < wavedMaze[row].length; col++) {
                switch (wavedMaze[row][col]) {
                    case -1:
                        sb.append(" ■ ");
                        break;
                    case -11:
                        sb.append("───");
                        break;
                    case -12:
                        sb.append(" │ ");
                        break;
                    case -13:
                        sb.append("─┐ ");
                        break;
                    case -14:
                        sb.append("─┘ ");
                        break;
                    case -15:
                        sb.append(" └─");
                        break;
                    case -16:
                        sb.append(" ┌─");
                        break;
                    case -10:
                        sb.append(" S ");
                        break;
                    case -20:
                        sb.append(" E ");
                        break;
                    case 0:
                        sb.append("   ");
                        break;
                    default:
                        if (wavedMaze[row][col] >= 100) {
                            sb.append(wavedMaze[row][col]);
                        } else if (wavedMaze[row][col] >= 10) {
                            sb.append(" " + wavedMaze[row][col]);
                        } else { //
                            sb.append(" " + wavedMaze[row][col] + " ");
                        }
                        break;
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
