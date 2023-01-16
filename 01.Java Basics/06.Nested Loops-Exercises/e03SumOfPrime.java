package w06Excersice;

import java.util.Scanner;

public class e03SumOfPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int sumPrime = 0;
        int sumNonPrime = 0;


        while (!input.equals("stop")) {

            int num = Integer.parseInt(input);
            int countFactors = 0;

            if (num < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            } else if (num < 2) {
                sumNonPrime+=num;
                input = scanner.nextLine();
                continue;
            }

            for (int i = 1; i <= num / 2; i++) {

                if (num % i == 0) {
                    countFactors++;
                }
            }
            if (countFactors > 1) {
                sumNonPrime += num;

            } else {
                sumPrime += num;
            }
            input = scanner.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d%n", sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d", sumNonPrime);
    }
}
