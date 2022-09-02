import java.util.LinkedList;
import java.util.Queue;

public class Solver {

    public static int c = 2;
    public static int d = 1;
    public static Queue<Operation> resultsQueue = new LinkedList<Operation>();

    private static int k1(int a) {
        return a * c;
    }

    private static int k2(int a) {
        return a + d;
    }

    public static String solver(int a, int b){
        int newA;
        
        newA = k1(a);
        if (newA == b){
            return "k1";
        } else {
            if (newA < b){
                Operation operetaion = new Operation();
                operetaion.a = newA;
                operetaion.opHistory += "k1";
                resultsQueue.add(operetaion);
            }
        }
        newA = k2(a);
        if (newA == b){
            return "k2";
        } else {
            if (newA < b){
                Operation operetaion = new Operation();
                operetaion.a = newA;
                operetaion.opHistory += "k2";
                resultsQueue.add(operetaion);
            }
        }

        while (!resultsQueue.isEmpty()){
            Operation op = new Operation();
            op = resultsQueue.poll();
            a = op.a;
            
            newA = k1(a);
            if (newA == b){
                return op.opHistory + " k1";
            } else {
                if (newA < b){
                    Operation operetaion = new Operation();
                    operetaion.a = newA;
                    operetaion.opHistory = op.opHistory + " k1";
                    resultsQueue.add(operetaion);
                }
            }
            newA = k2(a);
            if (newA == b){
                return op.opHistory + " k2";
            } else {
                if (newA < b){
                    Operation operetaion = new Operation();
                    operetaion.a = newA;
                    operetaion.opHistory = op.opHistory + " k2";
                    resultsQueue.add(operetaion);
                }
            }
        }
        return "нет решения";
    }
}
