package w06MidExamPractice;

import java.util.Scanner;

public class e01ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double totalPrice = 0;
        double priceBeforeTax = 0;
        double taxes = 0;

        while (!input.equals("special") && !input.equals("regular")) {

            double currentPrice = Double.parseDouble(input);

            if (currentPrice < 0) {
                System.out.println("Invalid price!");
            } else {
                priceBeforeTax += currentPrice;
            }
            input=scanner.nextLine();
        }

        if (priceBeforeTax == 0) {
            System.out.println("Invalid order!");
        } else {
            taxes = priceBeforeTax * 0.2;
            totalPrice = priceBeforeTax + taxes;

            if (input.equals("special")) {
                totalPrice-=0.1*totalPrice;

            }

            System.out.printf("Congratulations you've just bought a new computer!%n" +
                    "Price without taxes: %.2f$%n" +
                    "Taxes: %.2f$%n" +
                    "-----------%n" +
                    "Total price: %.2f$",priceBeforeTax,taxes,totalPrice);
        }

    }
}

