package w04MethodsExercise;

import java.util.Scanner;

public class e05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1=Integer.parseInt(scanner.nextLine());
        int num2=Integer.parseInt(scanner.nextLine());
        int num3=Integer.parseInt(scanner.nextLine());

        int result = subtractTheThirtFromSumOfFirstTwo(num1,num2,num3);
        System.out.println(result);
    }

    private static int subtractTheThirtFromSumOfFirstTwo(int num1, int num2,int num3) {

        int result = sumOfFirstTwo(num1,num2)-num3;
        return result;
    }

    private static int sumOfFirstTwo(int num1,int num2) {
        int sum = num1+num2;
        return sum;
    }
}
