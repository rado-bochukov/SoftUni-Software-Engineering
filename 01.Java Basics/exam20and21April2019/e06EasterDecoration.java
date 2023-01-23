package exam20and21April2019;

import java.util.Scanner;

public class e06EasterDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int clients = Integer.parseInt(scanner.nextLine());
        double totalBill = 0;

        for (int i = 1; i <= clients; i++) {

            String input = scanner.nextLine();
            int itemsCounter = 0;
            double bill = 0;

            while (!input.equals("Finish")) {

                String product = input;
                itemsCounter++;
                switch (product) {
                    case "basket":
                        bill += 1.5;
                        break;
                    case "wreath":
                        bill += 3.8;
                        break;
                    case "chocolate bunny":
                        bill += 7;
                        break;
                }
                input = scanner.nextLine();

            }
            if (itemsCounter % 2 == 0) {
                bill -= bill * 0.2;
            }
            System.out.printf("You purchased %d items for %.2f leva.%n", itemsCounter, bill);
            totalBill += bill;
            bill = 0;

        }
        double averageBill = totalBill / clients;
        System.out.printf("Average bill per client is: %.2f leva.", averageBill);
    }
}
