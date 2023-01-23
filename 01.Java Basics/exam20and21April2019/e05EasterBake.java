package exam20and21April2019;

import java.util.Scanner;

public class e05EasterBake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cakes = Integer.parseInt(scanner.nextLine());

        int totalSugarUsed = 0;
        int totalFlourUsed = 0;
        int maxSugar = 0;
        int maxFlour = 0;
        int cakeCounter = 0;

        for (int i = 1; i <= cakes; i++) {

            int sugar = Integer.parseInt(scanner.nextLine());
            int flour = Integer.parseInt(scanner.nextLine());

            totalSugarUsed += sugar;
            totalFlourUsed += flour;

            if (sugar > maxSugar) {
                maxSugar = sugar;
            }
            if (flour > maxFlour) {
                maxFlour = flour;
            }
        }
        int sugarPacks = (totalSugarUsed / 950) + 1;
        int flourPacks = (totalFlourUsed / 750) + 1;

        System.out.printf("Sugar: %d%n", sugarPacks);
        System.out.printf("Flour: %d%n", flourPacks);
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.", maxFlour, maxSugar);
    }
}
