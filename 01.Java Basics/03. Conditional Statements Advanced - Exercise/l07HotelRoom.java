package w03Excersice;

import java.util.Scanner;

public class l07HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double priceStudio = 0;
        double priceAp = 0;

        switch (month) {
            case "May":
            case "October":

                if (nights <= 7) {
                    priceStudio = 50;
                    priceAp = 65;
                } else if (nights <= 14) {
                    priceStudio = 50 - 50 * 0.05;
                    priceAp = 65;
                } else {
                    priceStudio = 50 - 50 * 0.3;
                    priceAp = 65 - 65 * 0.1;
                }

                break;
            case "June":
            case "September":

                if (nights > 14) {
                    priceStudio = 75.2 - 75.2 * 0.2;
                    priceAp = 68.7 - 68.7 * 0.1;
                } else {
                    priceStudio = 75.2;
                    priceAp = 68.2;
                }
                break;
            case "July":
            case "August":
                if (nights > 14) {
                    priceStudio = 76;
                    priceAp = 77 - 77 * 0.1;
                } else {
                    priceStudio = 76;
                    priceAp = 77;
                }

                break;
        }
        double totalCostStudio = priceStudio * nights;
        double totalCostAp = priceAp * nights;

        System.out.printf("Apartment: %.2f lv.%n", totalCostAp);
        System.out.printf("Studio: %.2f lv.", totalCostStudio);
    }
}
