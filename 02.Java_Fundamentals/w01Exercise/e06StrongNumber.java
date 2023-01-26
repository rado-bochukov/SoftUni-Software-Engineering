package w01Exercise;

import java.util.Scanner;

public class e06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        String num = "" + number;

        int length = num.length();
        int sumDigitsFactorial = 1;
        int totalSum = 0;

        for (int i = 0; i < num.length(); i++) {
            int currentDigit = Integer.parseInt("" + num.charAt(i));
            sumDigitsFactorial = 1;
            for (int j = 1; j <= currentDigit; j++) {

                sumDigitsFactorial *= j;
            }
            totalSum += sumDigitsFactorial;
        }
        if (totalSum == number) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
