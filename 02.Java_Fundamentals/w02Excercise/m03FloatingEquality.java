package w02Excercise;

import java.util.Scanner;

public class m03FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = Double.parseDouble(scanner.nextLine());
        double num2 = Double.parseDouble(scanner.nextLine());

        double eps=0.000001;

        double diff = Math.abs(num1-num2);

        if (diff<=eps) {
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
