public class PolyCreator {
    public static void main(String[] args) {
            System.out.println(createPolynom(randomInteger(1, 5)));
    }

    static int randomInteger(int min, int max) {
        return (int)(Math.random()*(max-min+1)+min);
    }

    static int[] coefArray(int k) {
        int[] coefArr = new int[k+1];
        for (int i = 0; i < k+1; i++) {
            coefArr[i] = randomInteger(0, 100);
        }
        return coefArr;
    }

    public static String createPolynom(int k) {
        String polySting = "";
        int[] coefs = coefArray(k);
        for (int i = k; i > 0; i--) {
            if (coefs[i] > 0) {
               polySting +=  coefs[i] + "*x" + ((i>1) ? "^"+i : "")  + " + ";
            }
        }
        polySting += coefs[0] + " = 0";
        return polySting;
    }
}