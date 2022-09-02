import java.util.Scanner;

/**
 * TriangleNumbers
 * get (n-th) Trinagle Number
 */
public class TriangleNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Вычисляем n-ое треугольное число. Введите целое число n (от 1 до 46340):");
        if (input.hasNextInt()) {
            int n = input.nextInt();
            if (n > 46340) {
                System.out.println("Вы ввели слишком большое n (для этой программы)");    
            } else {
            System.out.printf("n-ое треугольеон число = %d \n", CalcTriangeNum(n));
            }   
        } else {
            System.out.println("Вы ввели не целое число");
        }

        input.close();
    }

    static int CalcTriangeNum(int n) {
        return (int)(n*(n+1)/2);
    }
    
}
