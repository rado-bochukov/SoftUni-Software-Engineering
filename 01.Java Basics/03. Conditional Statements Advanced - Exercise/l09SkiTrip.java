package w03Excersice;

import java.util.Scanner;

public class l09SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String review = scanner.nextLine();

        double roomPriceReg = 18 * (days - 1);
        double ApPriceReg = 25 * (days - 1);
        double PresidentApPriceReg = 35 * (days - 1);
        double discount = 0;
        double regularPrice = 0;

        switch (room) {
            case "room for one person":
                discount = 0;
                regularPrice = roomPriceReg;
                break;
            case "apartment":
                regularPrice = ApPriceReg;

                if (days < 10) {
                    discount = regularPrice * 0.3;
                } else if (days <= 15) {
                    discount = regularPrice * 0.35;

                } else {
                    discount = regularPrice * 0.5;
                }
                break;
            case "president apartment":
                regularPrice = PresidentApPriceReg;

                if (days < 10) {
                    discount = regularPrice * 0.1;
                } else if (days <= 15) {
                    discount = regularPrice * 0.15;

                } else {
                    discount = regularPrice * 0.2;
                }
                break;

        }
        double additionalDiscount = 0;
        double totalCost = 0;


        switch (review) {
            case "positive":
                additionalDiscount = (regularPrice - discount) * 0.25;
                totalCost = regularPrice - discount + additionalDiscount;
                System.out.printf("%.2f", totalCost);
                break;
            case "negative":
                additionalDiscount = (regularPrice - discount) * 0.1;
                totalCost = regularPrice - discount - additionalDiscount;
                System.out.printf("%.2f", totalCost);
                break;

        }


    }
}
