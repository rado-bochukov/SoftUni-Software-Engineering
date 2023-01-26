package w01Exercise;

import java.util.Scanner;

public class e07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double insertedCoin = 0;
        String product = "";
        String input = scanner.nextLine();

        double totalCoinsAmount = 0;

        while (!input.equals("Start")) {

            switch (input) {
                case "0.1":
                case "0.2":
                case "0.5":
                case "1":
                case "2":
                    insertedCoin = Double.parseDouble(input);
                    totalCoinsAmount += insertedCoin;
                    break;
                default:
                    System.out.printf("Cannot accept %s%n", input);
                    break;
            }
            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while (!input.equals("End")) {

            product = input;

            switch (product) {
                case "Nuts":
                    if (totalCoinsAmount >= 2) {
                        System.out.println("Purchased Nuts");
                        totalCoinsAmount -= 2;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (totalCoinsAmount >= 0.7) {
                        System.out.println("Purchased Water");
                        totalCoinsAmount -= 0.7;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (totalCoinsAmount >= 1.5) {
                        System.out.println("Purchased Crisps");
                        totalCoinsAmount -= 1.5;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (totalCoinsAmount >= 0.8) {
                        System.out.println("Purchased Soda");
                        totalCoinsAmount -= 0.8;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (totalCoinsAmount >= 1.0) {
                        System.out.println("Purchased Coke");
                        totalCoinsAmount -= 1.0;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
            }
            input = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", totalCoinsAmount);
    }
}
