/**
 * Point in maze
 */
public class Point {
    private int x;
    private int y;

    /**
     * Point constuct
     * @param x - x position in maze;
     * @param y - y position in maze;
      */
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    @Override
    public String toString() {
        return "[x:" + x + ", y:" + y + "]";
    }
}
