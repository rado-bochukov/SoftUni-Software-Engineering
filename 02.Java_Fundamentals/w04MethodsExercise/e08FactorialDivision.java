package w04MethodsExercise;

import java.util.Scanner;

public class e08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1=Integer.parseInt(scanner.nextLine());
        int num2=Integer.parseInt(scanner.nextLine());

        double result = getFactorial(num1)/getFactorial(num2);
        System.out.printf("%.2f",result);
    }

    private static double getFactorial(int num1) {
        double result=1;
        for (int i = 1; i <=num1 ; i++) {
            result*=i;
        }
        return result;
    }
}
