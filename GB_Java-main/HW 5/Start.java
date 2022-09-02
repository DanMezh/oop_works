/**
 * Start
 */
public class Start {
    public static void main(String[] args) {
        String exp = "10.12 ^ 2.32 + 2*3+(1+2)*3";
        System.out.println("Инфиксная запись:" + exp);
        System.out.println("Постфиксная запись:" + MathSolver.infixToPostfix(exp));
        System.out.println("Результат вычисления:" + MathSolver.calculate(exp));
        System.out.println();

        exp = "(2^3 * (10 / (5 - 3)))^(Sin(Pi))"; 
        // 2 3 ^ 10 5 3 - / * Pi Sin ^
        System.out.println("Инфиксная запись:" + exp);
        System.out.println("Постфиксная запись:" + MathSolver.infixToPostfix(exp));
        System.out.println("Результат вычисления:" + MathSolver.calculate(exp));
        System.out.println();

        exp = "Sin(0)^2 + Cos(0) ^ 2"; 
        // 0 Sin 2 ^ 0 Cos 2 ^ +
        System.out.println("Инфиксная запись:" + exp);
        System.out.println("Постфиксная запись:" + MathSolver.infixToPostfix(exp));
        System.out.println("Результат вычисления:" + MathSolver.calculate(exp));
        System.out.println();

        exp = "{a+]}{(d*3)}"; // False
        System.out.println("Инфиксная запись:" + exp);
        System.out.println("Постфиксная запись:" + MathSolver.infixToPostfix(exp));
        System.out.println("Результат вычисления:" + MathSolver.calculate(exp));
                
    }
}