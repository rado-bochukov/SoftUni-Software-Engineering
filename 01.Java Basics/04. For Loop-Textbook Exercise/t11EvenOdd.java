package w04Excersise;

import java.util.Scanner;

public class t11EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        double oddMin = Integer.MAX_VALUE;
        double oddMax = Integer.MIN_VALUE;
        double evenMin = Integer.MAX_VALUE;
        double evenMax = Integer.MIN_VALUE;

        double sumOdd = 0;
        double sumEven = 0;

        for (int i = 1; i <=count; i++) {

            double number = Double.parseDouble(scanner.nextLine());

            if (i % 2 != 0) {
                sumOdd += number;

                if (number < oddMin) {
                    oddMin = number;

                if (number > oddMax) {
                    oddMax = number;

                }
            } else {
                sumEven += number;

                if (number < evenMin) {
                    evenMin = number;
                }
                if (number > evenMax) {
                    evenMax = number;

                }
            }
        }
        if (oddMin == Integer.MAX_VALUE) {
            System.out.println("OddSum=0.00,");
            System.out.println("OddMin=No,");
            System.out.println("OddMax=No,");
            System.out.println("EvenSum=0.00,");
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");

        } else if (evenMin == Integer.MAX_VALUE) {
            System.out.printf("OddSum=%.2f,%n", sumOdd);
            System.out.printf("OddMin=%.2f,%n", oddMin);
            System.out.printf("OddMax=%.2f,%n", oddMax);
            System.out.println("EvenSum=0.00,");
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");

        } else {
            System.out.printf("OddSum=%.2f,%n", sumOdd);
            System.out.printf("OddMin=%.2f,%n", oddMin);
            System.out.printf("OddMax=%.2f,%n", oddMax);
            System.out.printf("EvenSum=%.2f,%n", sumEven);
            System.out.printf("EvenMin=%.2f,%n", evenMin);
            System.out.printf("EvenMax=%.2f%n", evenMax);
        }
    }
}}
