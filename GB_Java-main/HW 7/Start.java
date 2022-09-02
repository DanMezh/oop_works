/**
 * Start
 */
public class Start {

    public static void main(String[] args) {
        String expression = "2? + ?5 = 69";
        System.out.println(DigitFinder.bruteFind(expression));

        expression = "2? + ?5 = ?3";
        System.out.println(DigitFinder.bruteFind(expression));

        expression = "?? + 16 = ?2";
        System.out.println(DigitFinder.bruteFind(expression));

        expression = "?2? + 16 = 1?2";
        System.out.println(DigitFinder.bruteFind(expression));

        expression = "?2 + 1? = 1??";
        System.out.println(DigitFinder.bruteFind(expression));

        expression = "2? + 5? = 69"; //нет решений 20 + 50 > 69
        System.out.println(DigitFinder.bruteFind(expression));
    }
}