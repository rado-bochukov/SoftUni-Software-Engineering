package w05Excersise;

import java.util.Scanner;

public class m02ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumExpected = Integer.parseInt(scanner.nextLine());

        double sumCards = 0;
        double sumCash = 0;

        int cashTxCount = 0;
        int cardTxCount = 0;
        int totalCollectedSum = 0;
        boolean notEnough = false;
        int currentTX = 0;

        while (totalCollectedSum < sumExpected) {

            String input = scanner.nextLine();


            if (input.equals("End")) {
                notEnough = true;
                break;
            }
            int currentTxValue = Integer.parseInt(input);
            currentTX += 1;


            if (currentTX % 2 != 0) {
                if (currentTxValue <= 100) {
                    System.out.println("Product sold!");
                    cashTxCount++;
                    sumCash += currentTxValue;

                } else {
                    System.out.println("Error in transaction!");
                    continue;
                }

            } else {
                if (currentTxValue >= 10) {
                    System.out.println("Product sold!");
                    cardTxCount++;
                    sumCards += currentTxValue;
                } else {
                    System.out.println("Error in transaction!");
                    continue;
                }
            }
            totalCollectedSum += currentTxValue;

        }
        double averageCS = sumCash / cashTxCount;
        double averageCC = sumCards / cardTxCount;
        if (notEnough) {
            System.out.println("Failed to collect required money for charity.");
        } else {
            System.out.printf("Average CS: %.2f%n", averageCS);
            System.out.printf("Average CC: %.2f", averageCC);
        }
    }
}
