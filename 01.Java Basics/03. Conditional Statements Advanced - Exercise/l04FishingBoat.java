package w03Excersice;

import java.util.Scanner;

public class l04FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budged = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fisherMen = Integer.parseInt(scanner.nextLine());


        double price = 0;
        switch (season) {

            case "Spring":
                if (fisherMen <= 6) {
                    price = 3000 - 3000 * 0.1;
                } else if (fisherMen > 7 && fisherMen <= 11) {
                    price = 3000 - 3000 * 0.15;
                } else {
                    price = 3000 - 3000 * 0.25;
                }
                break;
            case "Summer":
            case "Autumn":
                if (fisherMen <= 6) {
                    price = 4200 - 4200 * 0.1;
                } else if (fisherMen > 7 && fisherMen <= 11) {
                    price = 4200 - 4200 * 0.15;
                } else {
                    price = 4200 - 4200 * 0.25;
                }
                break;
            case "Winter":
                if (fisherMen <= 6) {
                    price = 2600 - 2600 * 0.1;
                } else if (fisherMen > 7 && fisherMen <= 11) {
                    price = 2600 - 2600 * 0.15;
                } else {
                    price = 2600 - 2600 * 0.25;
                }
                break;


        }
        double discount = 0;

        if (!season.equals("Autumn") && fisherMen % 2 == 0) {

            discount = price * 0.05;

        } else {
            discount = 0;


        }
        double totalCost = price - discount;
        double difference = Math.abs(totalCost - budged);

        if (totalCost <= budged) {
            System.out.printf("Yes! You have %.2f leva left.", difference);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", difference);
        }
    }
}
