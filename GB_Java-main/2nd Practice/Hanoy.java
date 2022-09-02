/**
 * Main
 */
public class Hanoy {

    public static void main(String[] args) {
        SolveByRecurse("1","3","2",3);
    }

    static void SolveByRecurse(String from, String to, String buf, int count) {
        if (count != 0) {
            SolveByRecurse (from, buf, to, count - 1);
            System.out.printf("[%s] >> [%s] \n", from, to);
            SolveByRecurse (buf, to, from, count - 1);
        }
    }
    
    
    static void SolveByCycle(int count) {
        //ToDo
    }

}