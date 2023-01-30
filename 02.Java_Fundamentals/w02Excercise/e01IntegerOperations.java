package w02Excercise;

import java.util.Scanner;

public class e01IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        int num4 = Integer.parseInt(scanner.nextLine());

        double result = ((num1+num2)/num3)*num4;

        System.out.printf("%.0f",result);
    }
}
